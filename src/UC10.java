import java.util.ArrayList;
import java.util.List;

public class UC10 {

    public static void main(String[] args) {
        // List to store bogies
        List<Bogie> bogies = new ArrayList<>();

        // Create bogies safely with try/catch
        try {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 54));
            bogies.add(new Bogie("First Class", 24));
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
        } catch (InvalidCapacityException e) {
            System.out.println("Error creating bogie: " + e.getMessage());
        }

        // Compute total seats using Stream reduce
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())  // extract capacity
                .reduce(0, Integer::sum);  // sum all capacities

        System.out.println("Total seating capacity of the train: " + totalSeats);
    }
}