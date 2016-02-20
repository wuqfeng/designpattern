package concretehandler;

import handler.Handler;

/**
 * Created by wuqf on 16-2-20.
 */
public class Client {
    public static void main(String[] args) {
        String msg="大家好：—）,<script>,敏感,就业,被就业,网络授课";
        Handler handler=new HtmlHandler();
        Handler handler1=new SesitiveHandler();

        HandlerChain handlerChain=new HandlerChain();
        handlerChain.add(handler);
        handlerChain.add(handler1);
        msg=handlerChain.doExcute(msg);
        System.out.println(msg);
    }
}
