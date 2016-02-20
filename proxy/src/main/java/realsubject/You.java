package realsubject;

import object.BeautifulGirl;
import subject.GiveGift;

/**
 * Created by wuqf on 16-2-20.
 */
public class You implements GiveGift {
    private BeautifulGirl girl;

    public You(BeautifulGirl girl) {
        this.girl = girl;
    }

    public void giveFlowers() {
        System.out.println(girl.name + ", this is your flowers");
    }

    public void giveChocolates() {
        System.out.println(girl.name + ", this is your chocolates");
    }

    public void giveBook() {
        System.out.println(girl.name + ", this is your books");
    }
}
