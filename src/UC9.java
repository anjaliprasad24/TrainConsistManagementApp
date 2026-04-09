import java.util.*;
import java.util.stream.Collectors;
import bogie.Bogie;
import bogie.InvalidCapacityException;

public class UC9 {

    public static void main(String[] args) throws InvalidCapacityException {

        System.out.println("=== UC9: Group Bogies by Type ===");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));

        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        Map<String, List<Bogie>> bogiesByType = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("\nGrouped Bogies by Type:");
        bogiesByType.forEach((type, list) -> {
            System.out.println(type + ":");
            list.forEach(b -> System.out.println("  " + b));
        });

        System.out.println("\nOriginal list remains unchanged:");
        bogies.forEach(System.out::println);
    }
}