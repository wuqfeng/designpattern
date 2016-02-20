package decorator;

import component.Beverage;
import concretedecorator.CondimentDecorator;

/**
 * Created by wuqf on 16-2-20.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Milk";
    }

    public double cost() {
        return beverage.cost() + 0.3;
    }
}
