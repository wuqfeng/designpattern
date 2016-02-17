package factorymethod.store;

import factorymethod.pizza.NYStyleCheesePizza;
import factorymethod.pizza.NYStyleSaltPizza;
import factorymethod.pizza.Pizza;
import factorymethod.pizza.PizzaType;

/**
 * Created by wuqf on 16-2-17.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CheesePizza:
                return new NYStyleCheesePizza();
            case SaltPizza:
                return new NYStyleSaltPizza();
            default:
                break;
        }
        return null;
    }
}
