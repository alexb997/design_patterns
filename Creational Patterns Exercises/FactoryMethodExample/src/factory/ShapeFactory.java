package factory;

import shapes.Shape;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class ShapeFactory {
    private static final int CACHE_LIMIT = 5;
    private Queue<Shape> shapeCache = new LinkedList<>();

    public Shape createShape(String shapeType) throws InvalidShapeException {
        return createShape(shapeType, -1, -1);
    }

    public Shape createShape(String shapeType, double dimensionW) throws InvalidShapeException {
        return createShape(shapeType, dimensionW, -1);
    }

    public Shape createShape(String shapeType, double dimensionW, double dimensionH) throws InvalidShapeException {
        Shape shape = null;

        if ("Circle".equalsIgnoreCase(shapeType)) {
            shape = (dimensionW > 0) ? new Circle(dimensionW) : new Circle();
        } else if ("Square".equalsIgnoreCase(shapeType)) {
            shape = (dimensionW > 0) ? new Square(dimensionW) : new Square();
        } else if ("Rectangle".equalsIgnoreCase(shapeType)) {
            shape = (dimensionW > 0 && dimensionH > 0) ? new Rectangle(dimensionW, dimensionH) : new Rectangle();      
        } else {
            throw new InvalidShapeException("Unsupported shape type: " + shapeType);
        }

        cacheShape(shape);

        return shape;
    }

    private void cacheShape(Shape shape) {
        if (shapeCache.size() >= CACHE_LIMIT) {
            shapeCache.poll();
        }
        shapeCache.add(shape);
    }

    public void printCachedShapes() {
        System.out.println("Cached Shapes:");
        for (Shape shape : shapeCache) {
            System.out.println(shape);
        }
    }

     public Shape modifyShape(Shape shape, Double dim1, Double dim2) throws InvalidShapeException {
        if (shape instanceof Circle) {
            ((Circle) shape).setRadius(Optional.ofNullable(dim1).orElse(((Circle) shape).getRadius()));
        } else if (shape instanceof Square) {
            ((Square) shape).setSide(Optional.ofNullable(dim1).orElse(((Square) shape).getSide()));
        } else if (shape instanceof Rectangle) {
            ((Rectangle) shape).setDimensions(
                Optional.ofNullable(dim1).orElse(((Rectangle) shape).getLength()),
                Optional.ofNullable(dim2).orElse(((Rectangle) shape).getWidth()));
        } else {
            throw new InvalidShapeException("Invalid shape type for modification.");
        }

        return shape;
    }

    private boolean shapeMatches(Shape shape, String shapeType, Double dim1, Double dim2) {
        if (shape instanceof Circle && "circle".equalsIgnoreCase(shapeType)) {
            return ((Circle) shape).getRadius() == Optional.ofNullable(dim1).orElse(((Circle) shape).getRadius());
        } else if (shape instanceof Square && "square".equalsIgnoreCase(shapeType)) {
            return ((Square) shape).getSide() == Optional.ofNullable(dim1).orElse(((Square) shape).getSide());
        } else if (shape instanceof Rectangle && "rectangle".equalsIgnoreCase(shapeType)) {
            return ((Rectangle) shape).getLength() == Optional.ofNullable(dim1).orElse(((Rectangle) shape).getLength()) &&
                   ((Rectangle) shape).getWidth() == Optional.ofNullable(dim2).orElse(((Rectangle) shape).getWidth());
        }
        return false;
    }
}