package concretecomponent;

import component.Beverage;

/**
 * Created by wuqf on 16-2-20.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.88;
    }
}
