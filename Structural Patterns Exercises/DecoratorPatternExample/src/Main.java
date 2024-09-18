import coffee.BasicCoffee;
import coffee.Coffee;
import coffee.MilkDecorator;
import coffee.SugarDecorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDescription() + " Cost: $" + coffee.cost());

        Coffee milkCoffee = new MilkDecorator(new BasicCoffee());
        System.out.println(milkCoffee.getDescription() + " Cost: $" + milkCoffee.cost());

        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new BasicCoffee()));
        System.out.println(sugarMilkCoffee.getDescription() + " Cost: $" + sugarMilkCoffee.cost());
    }
}