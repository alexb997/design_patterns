package computer;

public class Component {
    private String name;
    private String type;
    private double price;

    public Component(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return name + " (" + type + "): $" + price;
    }
}
