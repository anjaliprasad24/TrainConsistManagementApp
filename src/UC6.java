import java.util.HashMap;
import java.util.Map;

public class UC6 {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie -> capacity
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Add bogie capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 24);

        // Display all bogie capacities
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogie = entry.getKey();
            Integer capacity = entry.getValue();

            System.out.println(bogie + " -> Capacity: " + capacity);
        }

        System.out.println("\nProgram execution completed.");
    }
}