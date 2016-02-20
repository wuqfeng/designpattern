package invoker;

import command.Command;
import concretecommand.ChangeChannelCommand;
import concretecommand.CloseTVCommand;
import concretecommand.OpenTVCommand;
import receiver.Television;

/**
 * Created by wuqf on 16-2-20.
 */
public class Client {
    public static void main(String[] args) {
        Television tv = new Television();
        Command open = new OpenTVCommand(tv);
        Command close = new CloseTVCommand(tv);
        Command change = new ChangeChannelCommand(tv);
        Controller controller = new Controller(open, close, change);
        controller.open();
        controller.change();
        controller.close();
    }
}
