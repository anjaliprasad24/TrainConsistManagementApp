import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UC13 {

    public static void main(String[] args) {

        // Prepare a collection of bogies
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
            bogies.add(new Bogie("First Class", 80));
        }

        // --- Loop-based filtering ---
        long startLoop = System.nanoTime();
        List<Bogie> highCapacityLoop = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                highCapacityLoop.add(b);
            }
        }
        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        System.out.println("Loop-based filtering: " + highCapacityLoop.size() + " bogies found.");
        System.out.println("Execution time (ns): " + loopTime);

        // --- Stream-based filtering ---
        long startStream = System.nanoTime();
        List<Bogie> highCapacityStream = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        System.out.println("Stream-based filtering: " + highCapacityStream.size() + " bogies found.");
        System.out.println("Execution time (ns): " + streamTime);

        System.out.println("Results match: " + (highCapacityLoop.size() == highCapacityStream.size()));
    }
}