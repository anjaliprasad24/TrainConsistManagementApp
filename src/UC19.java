import java.util.Arrays;
import java.util.Scanner;

public class UC19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC19: Binary Search for Bogie ID ===");

        // Step 1: Input size
        System.out.print("\nEnter number of bogie IDs: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Step 2: Handle empty array case
        if (n == 0) {
            System.out.println("\nNo bogies available. Search cannot be performed.");
            sc.close();
            return;
        }

        String[] bogieIDs = new String[n];

        // Step 3: Input bogie IDs
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIDs[i] = sc.nextLine();
        }

        // Step 4: Sort before binary search (IMPORTANT)
        Arrays.sort(bogieIDs);

        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIDs));

        // Step 5: Input search key
        System.out.print("\nEnter bogie ID to search: ");
        String key = sc.nextLine();

        // Step 6: Binary Search
        int low = 0, high = n - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = key.compareTo(bogieIDs[mid]);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1;  // search right
            }
        }

        // Step 7: Output result
        if (found) {
            System.out.println("\nBogie ID " + key + " FOUND using Binary Search.");
        } else {
            System.out.println("\nBogie ID " + key + " NOT FOUND.");
        }

        sc.close();
    }
}