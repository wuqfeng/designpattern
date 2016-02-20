package concreteflyweight;

import flyweight.Shape;

/**
 * Created by wuqf on 16-2-20.
 */
public class Circle extends Shape {
    public String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("画了一个"+color+"的圆形");
    }
}
