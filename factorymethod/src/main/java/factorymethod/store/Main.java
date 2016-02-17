package factorymethod.store;

import factorymethod.pizza.PizzaType;

/**
 * Created by wuqf on 16-2-17.
 */
public class Main {
    public static void main(String[] args)
    {
        ChicagoPizzaStore cs=new ChicagoPizzaStore();
        cs.orderPizza(PizzaType.CheesePizza);
        cs.orderPizza(PizzaType.SaltPizza);
    }
}
