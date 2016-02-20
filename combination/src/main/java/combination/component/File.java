package combination.component;

/**
 * Created by wuqf on 16-2-20.
 */
public abstract class File {
    public String name;
    public File(String name)
    {
        this.name=name;
    }

    public abstract void display();
}
