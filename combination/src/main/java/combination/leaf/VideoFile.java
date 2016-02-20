package combination.leaf;

import combination.component.File;

/**
 * Created by wuqf on 16-2-20.
 */
public class VideoFile extends File {
    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("this is a video file ,name is "+ super.name);
    }
}
