import bogie.GoodsBogie;
import bogie.InvalidCapacityException;
import bogie.Bogie;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UC7 {
    public static void main(String[] args) {
        List<Bogie> passengerBogies = new ArrayList<>();

        try {
            passengerBogies.add(new Bogie("Sleeper", 72));
            passengerBogies.add(new Bogie("AC Chair", 54));
            passengerBogies.add(new Bogie("First Class", 24));
            passengerBogies.add(new Bogie("Executive", 80));
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        List<Bogie> filtered = passengerBogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("Bogies with capacity > 60:");
        filtered.forEach(System.out::println);
    }
}