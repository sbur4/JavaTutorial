package src.basic.GOFdesignPatterns.StructuralPatterns.Flyweight;

import java.util.HashMap;

/**
 * Легковес — это структурный паттерн проектирования, который позволяет вместить бóльшее
 * количество объектов в отведённую оперативную память.
 */

public class ShapeFactory {
    private static final HashMap<ShapeType, Shape2> shapes = new HashMap<ShapeType, Shape2>();

    public static Shape2 getShape(ShapeType type) {
        Shape2 shapeImpl = shapes.get(type);

        if (shapeImpl == null) {
            if (type.equals(ShapeType.OVAL_FILL)) {
                shapeImpl = new Oval(true);
            } else if (type.equals(ShapeType.OVAL_NOFILL)) {
                shapeImpl = new Oval(false);
            } else if (type.equals(ShapeType.LINE)) {
                shapeImpl = new Line();
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }

    public static enum ShapeType {
        OVAL_FILL, OVAL_NOFILL, LINE;
    }
}
