import java.util.Scanner;
import java.util.Arrays;

public class UC16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC16: Sort Passenger Bogies by Capacity (Bubble Sort) ===");

        // Take number of bogies
        System.out.print("\nEnter number of passenger bogies: ");
        int n = sc.nextInt();

        int[] capacities = new int[n];

        // Take input
        System.out.println("Enter capacities:");
        for (int i = 0; i < n; i++) {
            capacities[i] = sc.nextInt();
        }

        System.out.println("\nOriginal Capacities:");
        System.out.println(Arrays.toString(capacities));

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Capacities:");
        System.out.println(Arrays.toString(capacities));

        sc.close();
    }
}