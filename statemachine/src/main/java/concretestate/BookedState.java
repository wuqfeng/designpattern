package concretestate;

import context.Room;
import state.State;

/**
 * Created by wuqf on 16-2-21.
 */
public class BookedState implements State {
    Room hotelManagement;
    public BookedState(Room hotelManagement)
    {
        this.hotelManagement=hotelManagement;
    }

    public void bookRoom() {
        //do nothing
        System.out.println("该房间已经预定...");
    }

    public void unbookRoom() {
        System.out.println("unbook room succeeded");
        hotelManagement.state=hotelManagement.freeState;
    }

    public void checkInRoom() {
        System.out.println("check in room succeeded");
        hotelManagement.state=hotelManagement.checkinState;
    }

    public void checkOutRoom() {
        //do nothing
        System.out.println("该房间尚未入住...");
    }
}
