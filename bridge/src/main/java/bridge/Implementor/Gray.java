package bridge.Implementor;

import bridge.interfaces.Color;

/**
 * Created by wuqf on 16-2-19.
 */
public class Gray implements Color {
    public void bePaint(String shape) {
        System.out.println("gray "+shape);
    }
}
