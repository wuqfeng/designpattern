package abstractfactory.factory;

/**
 * Created by wuqf on 16-2-17.
 */
public class ChicagoIngredientFactory implements PizzaIngredientFactory{
    public String createDough() {
        return "Chicago dough";
    }

    public String createSauce() {
        return "Chicago sauce";
    }

    public String createName() {
        return "Chicago cheese Pizza";
    }
}
