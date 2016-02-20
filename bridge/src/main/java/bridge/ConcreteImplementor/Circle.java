package bridge.ConcreteImplementor;

import bridge.abstractclass.Shape;
import bridge.interfaces.Color;

/**
 * Created by wuqf on 16-2-19.
 */
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.bePaint("circle");
    }
}
