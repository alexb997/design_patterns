import computer.Computer;
import computer.AirCooling;
import computer.LiquidCooling;
import computer.ComputerBuilder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();

        Computer computer1 = builder.buildComputer("High-Performance", "16GB", "1TB SSD", "NVIDIA GTX 3080", new LiquidCooling());
        Computer computer2 = builder.buildComputer("Standard", "8GB", "512GB SSD", "Integrated", null);

        var bulkComputers = builder.buildBulk(3, "High-Performance", "16GB", "1TB SSD", "NVIDIA GTX 3080", new AirCooling());

        System.out.println("Individual Computers:");
        System.out.println(computer1);
        System.out.println("Price: $" + computer1.getPrice());
        System.out.println();
        System.out.println(computer2);
        System.out.println("Price: $" + computer2.getPrice());
        System.out.println();

        System.out.println("Bulk Computers:");
        for (Computer computer : bulkComputers) {
            System.out.println(computer);
            System.out.println("Price: $" + computer.getPrice());
            System.out.println();
        }
    }
}
