package bogie;
import bogie.GoodsBogie;

public class GoodsBogie {
    public String shape;
    public String cargo;

    public GoodsBogie(String shape, String cargo) {
        this.shape = shape;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return shape + "(" + cargo + ")";
    }
}