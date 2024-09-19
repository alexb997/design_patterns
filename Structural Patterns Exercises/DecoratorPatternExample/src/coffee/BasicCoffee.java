package coffee;

public class BasicCoffee implements Coffee {
    @Override
    public double getCost() {
        return 5.00;
    }

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public int getCalories() {
        return 10;
    }
}
