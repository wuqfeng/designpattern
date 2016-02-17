package abstractfactory.store;

import abstractfactory.pizza.PizzaType;

/**
 * Created by wuqf on 16-2-17.
 */
public class Main {
    public static void main(String[] args)
    {
        PizzaStore store=new NYPizzaStore();
        store.orderPizza(PizzaType.CheesePizza);
    }
}
