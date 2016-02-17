package abstractfactory.pizza;

import abstractfactory.factory.PizzaIngredientFactory;

/**
 * Created by wuqf on 16-2-17.
 */
public class SaltPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public SaltPizza(PizzaIngredientFactory factory) {
        this.ingredientFactory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }
}
