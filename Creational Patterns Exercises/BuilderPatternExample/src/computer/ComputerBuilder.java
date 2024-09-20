package computer;

import java.util.ArrayList;
import java.util.List;

public class ComputerBuilder {
    private Computer computer;

    public ComputerBuilder() {
        this.computer = new Computer();
    }

    public ComputerBuilder addCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder addRam(String ram) {
        computer.setRam(ram);
        return this;
    }

    public ComputerBuilder addGraphicsCard(String graphicsCard) {
        computer.setGraphicsCard(graphicsCard);
        return this;
    }

    public ComputerBuilder addCoolingSystem(CoolingSystem coolingSystem) {
        computer.setCoolingSystem(coolingSystem.toString());
        return this;
    }

    public Computer build() throws HighPerformanceComputerException {
        if (computer.getPrice() > 700 && computer.toString().contains("null")) {
            throw new HighPerformanceComputerException("High-performance computer must have a cooling system.");
        }
        return computer;
    }

    public List<Computer> buildBulk(int count) throws HighPerformanceComputerException {
        List<Computer> computers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            computers.add(build());
        }
        return computers;
    }
}