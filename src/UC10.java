// src/UC10.java
import bogie.Bogie;
import bogie.InvalidCapacityException;
import java.util.ArrayList;
import java.util.List;
import bogie.Bogie;
import bogie.GoodsBogie;
import bogie.InvalidCapacityException;

public class UC10 {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        try {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 54));
            bogies.add(new Bogie("First Class", 24));
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total seating capacity: " + totalSeats);
    }
}