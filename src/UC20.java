import java.util.Scanner;

public class UC20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC20: Exception Handling During Search Operations ===");

        // Step 1: Input size
        System.out.print("\nEnter number of bogie IDs: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieIDs = new String[n];

        // Step 2: Input bogie IDs (only if n > 0)
        if (n > 0) {
            System.out.println("Enter bogie IDs:");
            for (int i = 0; i < n; i++) {
                bogieIDs[i] = sc.nextLine();
            }
        }

        // Step 3: Input search key
        System.out.print("\nEnter bogie ID to search: ");
        String key = sc.nextLine();

        try {
            // ✅ Fail-fast validation
            if (bogieIDs.length == 0) {
                throw new IllegalStateException("No bogies available in the train. Search operation not allowed.");
            }

            // Step 4: Perform Linear Search (reuse UC18 logic)
            boolean found = false;

            for (int i = 0; i < bogieIDs.length; i++) {
                if (bogieIDs[i].equals(key)) {
                    found = true;
                    break;
                }
            }

            // Step 5: Output result
            if (found) {
                System.out.println("\nBogie ID " + key + " FOUND.");
            } else {
                System.out.println("\nBogie ID " + key + " NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            // Handle exception
            System.out.println("\nError: " + e.getMessage());
        }

        sc.close();
    }
}