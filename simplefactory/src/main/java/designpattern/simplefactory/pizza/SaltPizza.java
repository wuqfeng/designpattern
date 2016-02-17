package designpattern.simplefactory.pizza;

/**
 * Created by wuqf on 16-2-17.
 */
public class SaltPizza implements Pizza{

    public void prepare() {
        System.out.println("prepare SaltPizza ...");
    }

    public void bake() {
        System.out.println("bake SaltPizza ...");
    }

    public void cut() {
        System.out.println("cut SaltPizza ...");
    }

    public void box() {
        System.out.println("box SaltPizza ...");
    }

}


