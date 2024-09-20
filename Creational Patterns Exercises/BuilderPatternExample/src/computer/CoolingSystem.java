package computer;

public enum CoolingSystem {
    AIR_COOLING("Air Cooling"),
    LIQUID_COOLING("Liquid Cooling");

    private String coolingType;

    CoolingSystem(String coolingType) {
        this.coolingType = coolingType;
    }

    @Override
    public String toString() {
        return coolingType;
    }
}