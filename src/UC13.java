import bogie.Bogie;
import bogie.InvalidCapacityException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UC13 {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        try {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
            bogies.add(new Bogie("First Class", 80));
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        // Loop-based filtering
        long startLoop = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }
        long endLoop = System.nanoTime();

        // Stream-based filtering
        long startStream = System.nanoTime();
        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long endStream = System.nanoTime();

        System.out.println("Loop filtered bogies: " + loopFiltered);
        System.out.println("Stream filtered bogies: " + streamFiltered);
        System.out.println("Loop time (ns): " + (endLoop - startLoop));
        System.out.println("Stream time (ns): " + (endStream - startStream));
    }
}