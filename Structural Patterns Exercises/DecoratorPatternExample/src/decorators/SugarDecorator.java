package decorators;

import coffee.Coffee;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Sugar";
    }

    @Override
    public int getCalories() {
        return super.getCalories() + 30;
    }
}
