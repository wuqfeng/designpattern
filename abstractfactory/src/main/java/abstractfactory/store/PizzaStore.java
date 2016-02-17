package abstractfactory.store;

import abstractfactory.pizza.Pizza;
import abstractfactory.pizza.PizzaType;

/**
 * Created by wuqf on 16-2-17.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(PizzaType pizzaType)
    {
        Pizza pizza=createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(PizzaType type);
}
