package proxy;

import object.BeautifulGirl;
import realsubject.You;
import subject.GiveGift;

/**
 * Created by wuqf on 16-2-20.
 */
public class HerChum implements GiveGift {
    You you;

    public HerChum(BeautifulGirl girl) {
        this.you = new You(girl);
    }

    public void giveFlowers() {
        you.giveFlowers();
    }

    public void giveChocolates() {
        you.giveChocolates();
    }

    public void giveBook() {
        you.giveBook();
    }
}
