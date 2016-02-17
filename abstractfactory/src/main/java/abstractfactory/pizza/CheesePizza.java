package abstractfactory.pizza;

import abstractfactory.factory.PizzaIngredientFactory;

/**
 * Created by wuqf on 16-2-17.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory factory) {
        this.ingredientFactory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing " + ingredientFactory.createName());
        dough =ingredientFactory.createDough();
        sauce=ingredientFactory.createSauce();
    }
}
