package factorymethod.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuqf on 16-2-17.
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sause;

    protected List<String> toppings = new ArrayList();

    public void prepare() {
        System.out.println("preparing " + name);
        System.out.println("Tossing dough");
        System.out.println("Adding sause");
        System.out.println("Adding toppings");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");

    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");

    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");

    }

}
