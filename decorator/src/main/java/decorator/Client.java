package decorator;

import concretecomponent.DarkRoast;

/**
 * Created by wuqf on 16-2-20.
 */
public class Client {
    public static void main(String[] args) {
        DarkRoast darkRoast=new DarkRoast();
        Milk milk=new Milk(darkRoast);
        System.out.println(milk.getDescription());
        System.out.println(milk.cost());
    }
}
