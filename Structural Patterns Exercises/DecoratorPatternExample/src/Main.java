import coffee.BasicCoffee;
import coffee.Coffee;
import coffee.Size;
import decorators.MilkDecorator;
import decorators.SugarDecorator;
import decorators.WhippedCreamDecorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee(Size.SMALL);
        System.out.println("Cost: $" + coffee.getCost());
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Calories: " + coffee.getCalories());

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println("Cost after milk and sugar: $" + coffee.getCost());
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Calories: " + coffee.getCalories());

        coffee = new WhippedCreamDecorator(coffee);
        System.out.println("Cost after whipped cream: $" + coffee.getCost());
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Calories: " + coffee.getCalories());

        coffee = new MilkDecorator(coffee);
        System.out.println("Cost after double milk: $" + coffee.getCost());
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Calories: " + coffee.getCalories());

        System.out.println("Final Description: " + coffee.getDescription());
        System.out.println("Final Cost: $" + coffee.getCost());
        System.out.println("Final Calories: " + coffee.getCalories());
    }
}
