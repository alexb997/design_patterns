package decorators;

import coffee.Coffee;

public class WhippedCreamDecorator extends CoffeeDecorator {

    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.70;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Whipped Cream";
    }

    @Override
    public int getCalories() {
        return super.getCalories() + 80;
    }
}
