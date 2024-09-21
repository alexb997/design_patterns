import java.util.List;

import computer.Computer;
import computer.ComputerBuilder;
import computer.CoolingSystem;
import computer.HighPerformanceComputerException;

public class Main {
    public static void main(String[] args) {
        try {
            ComputerBuilder builder = new ComputerBuilder();
            Computer computer = builder
                    .addCpu("Intel i7")
                    .addRam("16GB")
                    .addGraphicsCard("NVIDIA RTX 3080")
                    .addCoolingSystem(CoolingSystem.AIR_COOLING)
                    .build();

            System.out.println(computer);
            System.out.println("Price: $" + computer.getPrice());

            try {
                Computer highPerfComputer = new ComputerBuilder()
                        .addCpu("Intel i9")
                        .addRam("32GB")
                        .addGraphicsCard("NVIDIA RTX 3090")
                        .build();
            } catch (HighPerformanceComputerException e) {
                System.err.println("Error: " + e.getMessage());
            }

            Computer gamingComputer = new ComputerBuilder()
                    .configureForGaming()
                    .build();

            System.out.println("\nGaming Computer:");
            System.out.println(gamingComputer);
            System.out.println("Price: $" + gamingComputer.getPrice());

            List<Computer> bulkComputers = builder.buildBulk(10);
            System.out.println("\nBuilt 10 computers:");
            for (int i = 0; i < bulkComputers.size(); i++) {
                System.out.println("Computer " + (i + 1) + ": " + bulkComputers.get(i));
            }

        } catch (HighPerformanceComputerException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}