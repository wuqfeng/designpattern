package concretehandler;

import handler.Handler;

/**
 * Created by wuqf on 16-2-20.
 */
public class SesitiveHandler implements Handler {
    public String doExcute(String msg) {
        return msg.replace("被就业", "就业").replace("敏感", "");
    }
}
