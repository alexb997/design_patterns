import coffee.BasicCoffee;
import coffee.Coffee;
import decorators.MilkDecorator;
import decorators.SugarDecorator;
import decorators.WhippedCreamDecorator;

public class Main {
    public static void main(String[] args) {
        Coffee myCoffee = new BasicCoffee();
        System.out.println("Cost: $" + myCoffee.getCost());
        System.out.println("Description: " + myCoffee.getDescription());
        System.out.println("Calories: " + myCoffee.getCalories());

        myCoffee = new MilkDecorator(new MilkDecorator(new SugarDecorator(new WhippedCreamDecorator(myCoffee))));
        
        System.out.println("\nCost: $" + myCoffee.getCost());
        System.out.println("Description: " + myCoffee.getDescription());
        System.out.println("Calories: " + myCoffee.getCalories());
    }
}
