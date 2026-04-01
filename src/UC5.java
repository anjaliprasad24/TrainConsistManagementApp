import java.util.LinkedHashSet;
import java.util.Set;

public class UC5 {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // Duplicate (will be ignored)

        // Display final formation
        System.out.println("\nFinal Train Formation (No duplicates, insertion order preserved):");
        System.out.println(trainFormation);

        System.out.println("\nTotal bogies in formation: " + trainFormation.size());

        System.out.println("\nProgram execution completed.");
    }
}