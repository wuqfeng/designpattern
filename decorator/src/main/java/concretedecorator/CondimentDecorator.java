package concretedecorator;

import component.Beverage;

/**
 * Created by wuqf on 16-2-20.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
