package factorymethod.pizza;

/**
 * Created by wuqf on 16-2-17.
 */
public class ChicagoStyleSaltPizza extends Pizza {
    public ChicagoStyleSaltPizza() {
        name = "ChicagoStyleSaltPizza";
        dough = "Extra Thick Crust Dough";
        sause = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Salt");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
