import java.util.*;
import java.util.stream.Collectors;

public class UC13 {

    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        // Handle potential InvalidCapacityException when creating bogies
        try {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
            bogies.add(new Bogie("First Class", 80));
            bogies.add(new Bogie("Sleeper", 64));
            bogies.add(new Bogie("AC Chair", 60));
        } catch (InvalidCapacityException e) {
            System.out.println("Error creating bogie: " + e.getMessage());
            return; // Stop program if invalid bogie is added
        }

        // Loop-based filtering
        long loopStart = System.nanoTime();
        List<Bogie> filteredLoop = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                filteredLoop.add(b);
            }
        }
        long loopEnd = System.nanoTime();
        System.out.println("Loop filtered bogies: " + filteredLoop.size());
        System.out.println("Loop time (ns): " + (loopEnd - loopStart));

        // Stream-based filtering
        long streamStart = System.nanoTime();
        List<Bogie> filteredStream = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        System.out.println("Stream filtered bogies: " + filteredStream.size());
        System.out.println("Stream time (ns): " + (streamEnd - streamStart));
    }
}