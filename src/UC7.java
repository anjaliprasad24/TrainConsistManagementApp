import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UC7 {

    public static void main(String[] args) {

        System.out.println("=== UC7: Sort Passenger Bogies by Capacity ===");

        // Use Bogie class from Bogie.java
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("Executive", 80));

        System.out.println("\nPassenger Bogies (Before Sorting):");
        passengerBogies.forEach(System.out::println);

        // Sort bogies by capacity descending
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        System.out.println("\nPassenger Bogies (Sorted by Capacity - High to Low):");
        passengerBogies.forEach(System.out::println);

        System.out.println("\nUC7 execution completed.\n");
    }
}