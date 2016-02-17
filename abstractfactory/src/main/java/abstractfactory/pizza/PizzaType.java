package abstractfactory.pizza;

/**
 * Created by wuqf on 16-2-17.
 */
public enum PizzaType {
    CheesePizza("CHEESE"),
    SaltPizza("SALT");

    private final String pizzaName;

    PizzaType(String pizzaName) {
        this.pizzaName = pizzaName;
    }
}
