package computer;

import java.util.ArrayList;
import java.util.List;

public class ComputerBuilder {

    public Computer buildComputer(String cpu, String ram, String storage, String graphicsCard, CoolingSystem coolingSystem) {
        return new Computer.Builder()
                .setCPU(cpu)
                .setRAM(ram)
                .setStorage(storage)
                .setGraphicsCard(graphicsCard)
                .setCoolingSystem(coolingSystem)
                .build();
    }

    public List<Computer> buildBulk(int quantity, String cpu, String ram, String storage, String graphicsCard, CoolingSystem coolingSystem) {
        List<Computer> computers = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            computers.add(buildComputer(cpu, ram, storage, graphicsCard, coolingSystem));
        }
        return computers;
    }
}
