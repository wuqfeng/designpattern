package flyweightfactory;

import flyweight.Shape;

/**
 * Created by wuqf on 16-2-20.
 */
public class Client {
    public static void main(String[] args) {
        Shape shape = Factory.getShape("红色");
        shape.draw();
        shape = Factory.getShape("黄色");
        shape.draw();
        shape = Factory.getShape("红色");
        shape.draw();
        Factory.getCount();
    }
}
