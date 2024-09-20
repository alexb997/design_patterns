package computer;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private String cpu;
    private String ram;
    private String graphicsCard;
    private String coolingSystem;
    private List<Component> components;

    public Computer() {
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
        addComponent(new Component("CPU", cpu, 300));
    }

    public void setRam(String ram) {
        this.ram = ram;
        addComponent(new Component("RAM", ram, 150));
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        addComponent(new Component("Graphics Card", graphicsCard, 400));
    }

    public void setCoolingSystem(String coolingSystem) {
        this.coolingSystem = coolingSystem;
        addComponent(new Component("Cooling System", coolingSystem, 100));
    }

    public double getPrice() {
        return components.stream().mapToDouble(Component::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + ", Graphics Card=" + graphicsCard + ", Cooling System=" + coolingSystem + "]";
    }
}
