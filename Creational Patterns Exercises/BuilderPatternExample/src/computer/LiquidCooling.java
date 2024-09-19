package computer;

public class LiquidCooling extends CoolingSystem {
    @Override
    public String getDescription() {
        return "Liquid Cooling";
    }

    @Override
    public double getPrice() {
        return 80;
    }
}
