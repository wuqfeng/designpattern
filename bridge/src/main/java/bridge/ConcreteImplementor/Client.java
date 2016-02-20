package bridge.ConcreteImplementor;

import bridge.Implementor.Black;
import bridge.abstractclass.Shape;
import bridge.interfaces.Color;
import sun.security.provider.SHA;

/**
 * Created by wuqf on 16-2-19.
 */
public class Client {


    public static void main(String[] args)
    {
        Color color = new Black();
        Shape shape = new Circle(color);
        shape.draw();
    }

}
