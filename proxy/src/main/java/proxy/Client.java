package proxy;

import object.BeautifulGirl;
import realsubject.You;

/**
 * Created by wuqf on 16-2-20.
 */
public class Client {
    public static void main(String[] args)
    {
        BeautifulGirl girl=new BeautifulGirl("MM");
        You you =new You(girl);
        HerChum chum=new HerChum(girl);
        chum.giveFlowers();
        chum.giveChocolates();
        chum.giveBook();
    }
}
