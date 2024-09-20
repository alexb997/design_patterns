package shapes;

public class Circle extends Shape {
    private double radius;

    private static final double DEFAULT_RADIUS = 1.0;

    public Circle() {
        this.radius = DEFAULT_RADIUS;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle (Radius: %.2f)", radius);
    }
}