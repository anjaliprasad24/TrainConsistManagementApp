import bogie.Bogie;
import bogie.GoodsBogie;
import bogie.InvalidCapacityException;
import java.util.ArrayList;
import java.util.List;

public class UC12 {
    public static void main(String[] args) {
        List<GoodsBogie> goods = new ArrayList<>();
        goods.add(new GoodsBogie("Rectangular", "Coal"));
        goods.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goods.add(new GoodsBogie("Cylindrical", "Petroleum"));

        boolean safe = goods.stream()
                .allMatch(g -> !g.type.equals("Cylindrical") || g.cargo.equals("Petroleum"));

        System.out.println("Train safety compliance: " + (safe ? "SAFE" : "UNSAFE"));
    }
}