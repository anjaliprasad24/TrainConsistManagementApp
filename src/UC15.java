import bogie.GoodsBogie;
import java.util.Scanner;

public class UC15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC15: Safe Cargo Assignment ===");

        System.out.print("\nEnter bogie shape (Rectangular/Cylindrical): ");
        String shape = sc.nextLine();

        System.out.print("Enter initial cargo: ");
        String initialCargo = sc.nextLine();

        GoodsBogie g = new GoodsBogie(shape, initialCargo);

        System.out.println("\nCurrent Bogie: " + g);

        System.out.print("\nEnter new cargo to assign: ");
        String newCargo = sc.nextLine();

        // Call assignment method (already has try-catch-finally)
        g.assignCargo(newCargo);

        System.out.println("\nFinal Bogie State: " + g);

        sc.close();
    }
}