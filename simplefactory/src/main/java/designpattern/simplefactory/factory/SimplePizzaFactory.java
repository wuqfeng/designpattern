package designpattern.simplefactory.factory;

import designpattern.simplefactory.pizza.CheesePizza;
import designpattern.simplefactory.pizza.Pizza;
import designpattern.simplefactory.pizza.PizzaType;
import designpattern.simplefactory.pizza.SaltPizza;

/**
 * Created by wuqf on 16-2-17.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType pizzaType) {
        System.out.println(pizzaType);
        switch (pizzaType) {
            case CheesePizza:
                return new CheesePizza();
            case SaltPizza:
                return new SaltPizza();
            default:
                return null;
        }
    }
}
