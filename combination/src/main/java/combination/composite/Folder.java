package combination.composite;

import combination.component.File;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuqf on 16-2-20.
 */
public class Folder extends File {

    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList();
    }


    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }


    @Override
    public void display() {
        System.out.println("this is a folder , name is "+ super.name);
        for (File file : files) {
            file.display();
        }
    }

    public void add(File file) {
        files.add(file);
    }
    public void delete(File file)
    {
        files.remove(file);
    }
}
