package combination.leaf;

import combination.component.File;

/**
 * Created by wuqf on 16-2-20.
 */
public class TextFile extends File{
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("this is a Text file , name is "+super.name );
    }
}
