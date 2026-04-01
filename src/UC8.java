import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import bogie.Bogie;

public class UC8 {

    public static void main(String[] args) {

        System.out.println("=== UC8: Filter Passenger Bogies Using Streams ===");

        // Reuse Bogie class from Bogie.java
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("Executive", 80));

        System.out.println("\nAll Passenger Bogies:");
        passengerBogies.forEach(System.out::println);

        // Filter bogies with capacity > 60 using Streams
        List<Bogie> highCapacityBogies = passengerBogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Passenger Bogies (Capacity > 60):");
        highCapacityBogies.forEach(System.out::println);

        // Original list remains unchanged
        System.out.println("\nOriginal list remains unchanged:");
        passengerBogies.forEach(System.out::println);

        System.out.println("\nUC8 execution completed.\n");
    }
}