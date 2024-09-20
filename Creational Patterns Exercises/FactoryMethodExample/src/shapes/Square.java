package shapes;

public class Square extends Shape {
    private double side;

    private static final double DEFAULT_SIDE = 1.0;

    public Square() {
        this.side = DEFAULT_SIDE;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return String.format("Square (Side: %.2f)", side);
    }
}
