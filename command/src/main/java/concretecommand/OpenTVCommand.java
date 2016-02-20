package concretecommand;

import command.Command;
import receiver.Television;

/**
 * Created by wuqf on 16-2-20.
 */
public class OpenTVCommand implements Command {
    private Television tv;

    public OpenTVCommand(Television tv)
    {
       this.tv=tv;
    }
    public void excute() {
        tv.open();
    }
}
