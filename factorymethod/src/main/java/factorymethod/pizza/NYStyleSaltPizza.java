package factorymethod.pizza;

/**
 * Created by wuqf on 16-2-17.
 */
public class NYStyleSaltPizza extends Pizza{
    public NYStyleSaltPizza() {
        name = "Ny Style Sauce and Salt Pizza";
        dough = "Thin Crust Dough";
        sause = "Marinara Sauce";
        toppings.add("Crated Reggiano Salt");

    }
}
