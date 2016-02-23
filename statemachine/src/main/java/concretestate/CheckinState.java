package concretestate;

import context.Room;
import state.State;

/**
 * Created by wuqf on 16-2-21.
 */
public class CheckinState implements State {
    Room hotemManagement;
    public CheckinState(Room hotemManagement)
    {
        this.hotemManagement=hotemManagement;
    }

    public void bookRoom() {
        //do nothing
        System.out.println("该房间已经入住了...");
    }

    public void unbookRoom() {
        //do nothing
        System.out.println("该房间已经入住了...");
    }

    public void checkInRoom() {
        //do nothing
        System.out.println("该房间已经入住了...");
    }

    public void checkOutRoom() {
        System.out.println("check out room succeeded");
        hotemManagement.state=hotemManagement.freeState;
    }
}
