import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;   // e.g., "Rectangular", "Cylindrical"
    String cargo;  // e.g., "Coal", "Petroleum"

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "GoodsBogie{" +
                "type='" + type + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}

public class UC12 {

    public static void main(String[] args) {
        System.out.println("=== UC12: Safety Compliance Check for Goods Bogies ===");

        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        // Safety check: Cylindrical bogies must carry only Petroleum
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        // Display results
        System.out.println("Goods Bogies: " + goodsBogies);
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFETY COMPLIANT ❌");
        }

        System.out.println("\nUC12 execution completed.");
    }
}