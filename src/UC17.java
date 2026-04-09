import java.util.Arrays;
import java.util.Scanner;

public class UC17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC17: Sort Bogie Names Using Arrays.sort() ===");

        // Take number of bogies
        System.out.print("\nEnter number of bogie types: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieNames = new String[n];

        // Take input
        System.out.println("Enter bogie names:");
        for (int i = 0; i < n; i++) {
            bogieNames[i] = sc.nextLine();
        }

        System.out.println("\nOriginal Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // ✅ Built-in sorting
        Arrays.sort(bogieNames);

        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 execution completed.\n");

        sc.close();
    }
}