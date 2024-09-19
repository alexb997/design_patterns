import shapes.Shape;
import factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle1 = factory.createShape("circle", 5.0);
        Shape square1 = factory.createShape("square", 4.0);
        Shape rectangle1 = factory.createShape("rectangle", 3.0, 6.0);

        Shape circle2 = factory.createShape("circle");
        Shape square2 = factory.createShape("square");
        Shape rectangle2 = factory.createShape("rectangle");

        displayShape(circle1);
        displayShape(square1);
        displayShape(rectangle1);
        displayShape(circle2);
        displayShape(square2);
        displayShape(rectangle2);

        System.out.println("\nCached Shapes:");
        for (Shape shape : factory.getShapeCache()) {
            displayShape(shape);
        }
    }

    private static void displayShape(Shape shape) {
        System.out.println(shape.getDescription());
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println();
    }
}