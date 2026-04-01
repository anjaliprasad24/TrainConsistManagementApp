import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class representing passenger bogie
class Bogie {
    private String name;
    private int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    // For display
    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class UC7 {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create a list of passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // Add bogies with their capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 24));

        // Display before sorting
        System.out.println("\nPassenger Bogies (Before Sorting):");
        passengerBogies.forEach(System.out::println);

        // Sort bogies by capacity in descending order
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        // Display after sorting
        System.out.println("\nPassenger Bogies (Sorted by Capacity - High to Low):");
        passengerBogies.forEach(System.out::println);

        System.out.println("\nProgram execution completed.");
    }
}