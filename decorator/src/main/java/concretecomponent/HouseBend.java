package concretecomponent;

import component.Beverage;

/**
 * Created by wuqf on 16-2-20.
 */
public class HouseBend extends Beverage {
    public HouseBend() {
        description = "HouseBend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
