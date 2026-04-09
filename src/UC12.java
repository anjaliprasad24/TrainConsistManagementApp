import bogie.GoodsBogie;
import java.util.*;

public class UC12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<GoodsBogie> goods = new ArrayList<>();

        System.out.println("=== UC12: Train Safety Compliance Check ===");

        System.out.print("\nEnter number of goods bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for bogie " + (i + 1));

            System.out.print("Enter shape (Rectangular/Cylindrical): ");
            String shape = sc.nextLine();

            System.out.print("Enter cargo: ");
            String cargo = sc.nextLine();

            goods.add(new GoodsBogie(shape, cargo));
        }

        // Safety check
        boolean safe = goods.stream()
                .allMatch(g -> !g.shape.equals("Cylindrical") || g.cargo.equals("Petroleum"));

        System.out.println("\nTrain safety compliance: " + (safe ? "SAFE" : "UNSAFE"));

        sc.close();
    }
}