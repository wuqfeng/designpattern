package context;

import concretestate.BookedState;
import concretestate.CheckinState;
import concretestate.FreeState;
import state.State;

/**
 * Created by wuqf on 16-2-21.
 */
public class Room implements State{

    public State freeState;
    public State bookedState;
    public State checkinState;
    public State state;

    public Room()
    {
        freeState=new FreeState(this);
        bookedState=new BookedState(this);
        checkinState=new CheckinState(this);
        state=freeState;
    }

    public String toString()
    {
        return "current state is "+state.toString();
    }

    public void bookRoom() {
        state.bookRoom();
    }

    public void unbookRoom() {
        state.unbookRoom();
    }

    public void checkInRoom() {
        state.checkInRoom();
    }

    public void checkOutRoom() {
        state.checkOutRoom();
    }
}
