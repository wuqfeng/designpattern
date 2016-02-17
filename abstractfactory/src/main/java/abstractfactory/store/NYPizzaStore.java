package abstractfactory.store;

import abstractfactory.factory.NYIngredientFactory;
import abstractfactory.factory.PizzaIngredientFactory;
import abstractfactory.pizza.CheesePizza;
import abstractfactory.pizza.Pizza;
import abstractfactory.pizza.PizzaType;
import abstractfactory.pizza.SaltPizza;

/**
 * Created by wuqf on 16-2-17.
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType type) {
        PizzaIngredientFactory factory=new NYIngredientFactory();
        switch (type){
            case CheesePizza:
                return new CheesePizza(factory);
            case SaltPizza:
                return new SaltPizza(factory);
            default:
                return null;
        }
    }
}
