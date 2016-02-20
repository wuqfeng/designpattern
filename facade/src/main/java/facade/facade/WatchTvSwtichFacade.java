package facade.facade;

import facade.subsystem.Light;
import facade.subsystem.Television;

/**
 * Created by wuqf on 16-2-20.
 */
public class WatchTvSwtichFacade {
    private Television television=new Television();
    private Light light=new Light();
    public void on()
    {
        light.on();
        television.on();
    }
    public void off()
    {
        light.off();
        television.off();
    }

}
