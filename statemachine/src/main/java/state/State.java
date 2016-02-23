package state;

/**
 * Created by wuqf on 16-2-21.
 */
public interface State {
    public void bookRoom();

    public void unbookRoom();

    public void checkInRoom();

    public void checkOutRoom();
}
