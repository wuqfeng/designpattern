package facade.facade;

import facade.subsystem.Light;

/**
 * Created by wuqf on 16-2-20.
 */
public class Client {
    public static void main(String [] args)
    {
        WatchTvSwtichFacade facade=new WatchTvSwtichFacade();
        facade.on();
        System.out.println("可以看电视了");
    }
}
