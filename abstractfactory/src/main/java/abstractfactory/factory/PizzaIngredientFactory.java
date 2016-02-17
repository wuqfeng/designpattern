package abstractfactory.factory;

/**
 * Created by wuqf on 16-2-17.
 */
public interface PizzaIngredientFactory {
    public String createName();
    public String createDough();
    public String createSauce();

}
