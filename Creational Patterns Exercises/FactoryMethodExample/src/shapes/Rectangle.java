package shapes;

public class Rectangle extends Shape {
    private double length;
    private double width;

    private static final double DEFAULT_LENGTH = 2.0;
    private static final double DEFAULT_WIDTH = 1.0;

    public Rectangle() {
        this.length = DEFAULT_LENGTH;
        this.width = DEFAULT_WIDTH;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return String.format("Rectangle (Length: %.2f, Width: %.2f)", length, width);
    }
}
