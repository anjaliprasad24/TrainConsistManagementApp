import java.util.HashSet;
import java.util.Set;

public class UC3 {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        // Display the bogie IDs
        System.out.println("\nBogie IDs in the train (duplicates automatically removed):");
        System.out.println(bogieIds);

        System.out.println("\nTotal unique bogies: " + bogieIds.size());

        System.out.println("\nProgram execution completed.");
    }
}