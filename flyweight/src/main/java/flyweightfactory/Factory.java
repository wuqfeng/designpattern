package flyweightfactory;

import concreteflyweight.Circle;
import flyweight.Shape;
import sun.security.provider.SHA;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuqf on 16-2-20.
 */
public class Factory {
    public static Map<String, Shape> shapes = new HashMap<String, Shape>();

    public static Shape getShape(String color) {
        Shape shape = shapes.get(color);
        if (shape == null) {
            shape = new Circle(color);
            shapes.put(color, shape);
        }
        return shape;
    }

    public static void getCount() {
        System.out.println(shapes.size());
    }

}
