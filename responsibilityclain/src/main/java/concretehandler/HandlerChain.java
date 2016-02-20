package concretehandler;

import handler.Handler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuqf on 16-2-20.
 */
public class HandlerChain implements Handler {
    List<Handler> handlers = new ArrayList<Handler>();

    public String doExcute(String msg) {
        for (Handler handler : handlers) {
            msg = handler.doExcute(msg);
        }
        return msg;
    }

    public HandlerChain add(Handler handler) {
        handlers.add(handler);
        return this;
    }

}
