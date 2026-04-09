package bogie;

public class GoodsBogie {
    public String shape;
    public String cargo;

    public GoodsBogie(String shape, String cargo) {
        this.shape = shape;
        this.cargo = cargo;
    }

    public void assignCargo(String newCargo) {
        try {
            // Validation
            if (shape.equals("Rectangular") && newCargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe assignment: Petroleum cannot be stored in Rectangular bogie");
            }

            // Assign if safe
            this.cargo = newCargo;
            System.out.println("Cargo assigned successfully: " + newCargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed for " + shape + " bogie.");
        }
    }

    @Override
    public String toString() {
        return shape + "(" + cargo + ")";
    }
}