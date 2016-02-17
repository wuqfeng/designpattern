package factorymethod.store;

import factorymethod.pizza.*;

/**
 * Created by wuqf on 16-2-17.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CheesePizza:
                return new ChicagoStyleCheesePizza();
            case SaltPizza:
                return new ChicagoStyleSaltPizza();
            default:
                break;
        }
        return null;
    }
}
