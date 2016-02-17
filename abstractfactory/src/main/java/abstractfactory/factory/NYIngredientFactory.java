package abstractfactory.factory;

/**
 * Created by wuqf on 16-2-17.
 */
public class NYIngredientFactory implements PizzaIngredientFactory {

    public String createDough() {
        return "NY dough";
    }

    public String createSauce() {
        return "NY sauce";
    }

    public String createName() {
        return "NY cheese Pizza";
    }
}
