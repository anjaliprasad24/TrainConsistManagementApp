import java.util.Scanner;

public class UC18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC18: Linear Search for Bogie ID ===");

        // Step 1: Take number of bogies
        System.out.print("\nEnter number of bogie IDs: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieIDs = new String[n];

        // Step 2: Input bogie IDs
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIDs[i] = sc.nextLine();
        }

        // Step 3: Input search key
        System.out.print("\nEnter bogie ID to search: ");
        String key = sc.nextLine();

        // Step 4: Linear Search
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (bogieIDs[i].equals(key)) {
                found = true;
                break; // ✅ early termination
            }
        }

        // Step 5: Output result
        if (found) {
            System.out.println("\nBogie ID " + key + " FOUND in the consist.");
        } else {
            System.out.println("\nBogie ID " + key + " NOT FOUND in the consist.");
        }

        sc.close();
    }
}