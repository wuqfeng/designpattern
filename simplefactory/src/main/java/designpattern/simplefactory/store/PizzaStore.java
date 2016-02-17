package designpattern.simplefactory.store;

import designpattern.simplefactory.factory.SimplePizzaFactory;
import designpattern.simplefactory.pizza.Pizza;
import designpattern.simplefactory.pizza.PizzaType;

/**
 * Created by wuqf on 16-2-17.
 */
public class PizzaStore {
    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory=factory;
    }
    public Pizza orderPizza(PizzaType pizzaType)
    {
        Pizza pizza = factory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public static void main(String[] args)
    {
        SimplePizzaFactory factory=new SimplePizzaFactory();
        PizzaStore store=new PizzaStore(factory);
        store.orderPizza(PizzaType.SaltPizza);
    }
}
