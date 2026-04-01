import java.util.ArrayList;
import java.util.List;
import bogie.Bogie;
import bogie.GoodsBogie;
import bogie.InvalidCapacityException;

public class UC14 {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        try {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
            bogies.add(new Bogie("First Class", 0)); // Will throw exception
        } catch (InvalidCapacityException e) {
            System.out.println("Error creating bogie: " + e.getMessage());
        }

        // Display valid bogies
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}