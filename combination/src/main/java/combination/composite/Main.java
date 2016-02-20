package combination.composite;

import combination.leaf.TextFile;
import combination.leaf.VideoFile;

/**
 * Created by wuqf on 16-2-20.
 */
public class Main {
    public static void main(String[] args)
    {
        Folder folder=new Folder("root");
        folder.add(new TextFile("a.txt"));
        folder.add(new VideoFile("b.avi"));
        folder.display();
    }
}
