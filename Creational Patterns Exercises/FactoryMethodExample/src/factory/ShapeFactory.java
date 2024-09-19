package factory;

import shapes.Shape;
import shapes.Circle;
import shapes.Square;
import shapes.Rectangle;

import java.util.LinkedList;
import java.util.List;

public class ShapeFactory {
    private static final int CACHE_SIZE = 5;
    private List<Shape> shapeCache = new LinkedList<>();

    public Shape createShape(String type, double... dimensions) {
        Shape shape = null;

        switch (type.toLowerCase()) {
            case "circle":
                double radius = dimensions.length > 0 ? dimensions[0] : 1.0;
                shape = new Circle(radius);
                break;
            case "square":
                double side = dimensions.length > 0 ? dimensions[0] : 1.0;
                shape = new Square(side);
                break;
            case "rectangle":
                double width = dimensions.length > 0 ? dimensions[0] : 1.0;
                double height = dimensions.length > 1 ? dimensions[1] : 1.0;
                shape = new Rectangle(width, height);
                break;
        }

        if (shape != null) {
            cacheShape(shape);
        }
        return shape;
    }

    private void cacheShape(Shape shape) {
        if (shapeCache.size() >= CACHE_SIZE) {
            shapeCache.remove(0);
        }
        shapeCache.add(shape);
    }

    public List<Shape> getShapeCache() {
        return shapeCache;
    }
}
