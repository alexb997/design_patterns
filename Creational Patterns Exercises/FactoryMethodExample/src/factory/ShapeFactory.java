package factory;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;

public class ShapeFactory {
    public Shape createShape(String type) {
        switch (type.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                throw new IllegalArgumentException("Unknown shape type: " + type);
        }
    }
}