import java.util.*;
import java.util.stream.Collectors;

public class UC10 {

    public static void main(String[] args) {
        System.out.println("=== UC10: Count Total Seats in Train ===");

        // Reuse the Bogie class from Bogie.java
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));

        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // Use Stream map() and reduce() to calculate total seating capacity
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())       // extract capacity
                .reduce(0, Integer::sum);       // sum all capacities

        System.out.println("\nTotal seating capacity in train: " + totalSeats);

        // Original list remains unchanged
        System.out.println("\nOriginal list remains unchanged:");
        bogies.forEach(System.out::println);

        System.out.println("\nUC10 execution completed.\n");
    }
}