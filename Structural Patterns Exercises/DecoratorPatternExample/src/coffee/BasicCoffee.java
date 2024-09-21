package coffee;

public class BasicCoffee implements Coffee {
    private String description = "Basic Coffee";
    private double cost;
    private int calories;
    private Size size;

    public BasicCoffee(Size size) {
        this.size = size;
        switch (size) {
            case SMALL:
                cost = 2.0;
                calories = 50;
                break;
            case MEDIUM:
                cost = 3.0;
                calories = 70;
                break;
            case LARGE:
                cost = 4.0;
                calories = 90;
                break;
        }
    }

    @Override
    public String getDescription() {
        return description + " (" + size + ")";
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public int getCalories() {
        return calories;
    }
}
