package computer;

public class AirCooling extends CoolingSystem {
    @Override
    public String getDescription() {
        return "Air Cooling";
    }

    @Override
    public double getPrice() {
        return 30;
    }
}
