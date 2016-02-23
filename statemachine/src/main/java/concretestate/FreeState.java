package concretestate;

import context.Room;
import state.State;

/**
 * Created by wuqf on 16-2-21.
 */
public class FreeState implements State {
    Room hotelManagement;

    public FreeState(Room hotelManagement) {
        this.hotelManagement = hotelManagement;
    }

    public void bookRoom() {
        System.out.println("book room succeeded");
        hotelManagement.state = hotelManagement.bookedState;
    }

    public void unbookRoom() {
        System.out.println("unbook room succeeded");
        hotelManagement.state = hotelManagement.freeState;
    }

    public void checkInRoom() {
        System.out.println("check in room succeeded");
        hotelManagement.state = hotelManagement.checkinState;
    }

    public void checkOutRoom() {
        //do nothing
        System.out.println("该房间尚未入住...");
    }
}
