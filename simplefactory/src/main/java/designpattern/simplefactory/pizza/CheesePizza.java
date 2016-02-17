package designpattern.simplefactory.pizza;

/**
 * Created by wuqf on 16-2-17.
 */
public class CheesePizza implements Pizza {
    public void prepare() {
        System.out.println("prepare CheesePizza ...");
    }

    public void bake() {
        System.out.println("bake CheesePizza ...");
    }

    public void cut() {
        System.out.println("cut CheesePizza ...");
    }

    public void box() {
        System.out.println("box CheesePizza ...");
    }
}
