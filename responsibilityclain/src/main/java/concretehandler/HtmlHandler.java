package concretehandler;

import com.sun.org.apache.regexp.internal.RE;
import handler.Handler;

/**
 * Created by wuqf on 16-2-20.
 */
public class HtmlHandler implements Handler {
    public String doExcute(String msg) {
        return msg.replace(">", "").replace("<", "");
    }
}
