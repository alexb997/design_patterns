import shapes.Shape;
import factory.InvalidShapeException;
import factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        try {
            Shape circle = shapeFactory.createShape("Circle", 5);
            System.out.println(circle + " Area: " + circle.calculateArea() + " Perimeter: " + circle.calculatePerimeter());

            Shape square = shapeFactory.createShape("Square", 4);
            System.out.println(square + " Area: " + square.calculateArea() + " Perimeter: " + square.calculatePerimeter());

            Shape rectangle = shapeFactory.createShape("Rectangle", 6, 3);
            System.out.println(rectangle + " Area: " + rectangle.calculateArea() + " Perimeter: " + rectangle.calculatePerimeter());

            Shape triangle = shapeFactory.createShape("Triangle");
        } catch (InvalidShapeException e) {
            System.err.println(e.getMessage());
        }

        try {
            Shape defaultCircle = shapeFactory.createShape("Circle");
            Shape defaultSquare = shapeFactory.createShape("Square");
            Shape defaultRectangle = shapeFactory.createShape("Rectangle");

            System.out.println(defaultCircle + " Area: " + defaultCircle.calculateArea() + " Perimeter: " + defaultCircle.calculatePerimeter());
            System.out.println(defaultSquare + " Area: " + defaultSquare.calculateArea() + " Perimeter: " + defaultSquare.calculatePerimeter());
            System.out.println(defaultRectangle + " Area: " + defaultRectangle.calculateArea() + " Perimeter: " + defaultRectangle.calculatePerimeter());
        } catch (InvalidShapeException e) {
            System.err.println(e.getMessage());
        }

        shapeFactory.printCachedShapes();
    }
}