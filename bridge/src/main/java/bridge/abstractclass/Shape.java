package bridge.abstractclass;

import bridge.interfaces.Color;

/**
 * Created by wuqf on 16-2-19.
 */
public abstract class Shape {
    public Color color;

    public Shape(Color color){
        this.color=color;
    }
    public abstract void draw();
}
