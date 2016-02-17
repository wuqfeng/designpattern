package factorymethod.store;

import factorymethod.pizza.Pizza;
import factorymethod.pizza.PizzaType;

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
    public abstract Pizza createPizza(PizzaType pizzaType);
}
