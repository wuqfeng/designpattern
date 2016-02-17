package abstractfactory.pizza;

/**
 * Created by wuqf on 16-2-17.
 */
public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 munites at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
