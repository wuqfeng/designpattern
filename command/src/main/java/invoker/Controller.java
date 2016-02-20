package invoker;

import command.Command;

/**
 * Created by wuqf on 16-2-20.
 */
public class Controller {
    private Command openTVCommand;
    private Command closeTVCommand;
    private Command changeChannelCommand;

    public Controller(Command openTVCommand, Command closeTVCommand, Command changeChannelCommand) {
        this.openTVCommand = openTVCommand;
        this.closeTVCommand = closeTVCommand;
        this.changeChannelCommand = changeChannelCommand;
    }

    public void open() {
        openTVCommand.excute();
    }

    public void close() {
        closeTVCommand.excute();
    }

    public void change() {
        changeChannelCommand.excute();
    }
}
