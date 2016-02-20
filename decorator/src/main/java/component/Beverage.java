package component;

/**
 * Created by wuqf on 16-2-20.
 */
public abstract  class Beverage {
    public String getDescription() {
        return description;
    }

    protected String description="unknown beverage";

    public abstract double cost();
}
