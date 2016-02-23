package context;

/**
 * Created by wuqf on 16-2-21.
 */
public class Client {

    public static void main(String[] args)
    {
        Room[] rooms=new Room[3];
        for(int i=0;i<3;i++)
        {
            rooms[i]=new Room();
        }
        rooms[0].bookRoom();
        rooms[0].unbookRoom();
        rooms[0].checkOutRoom();
        rooms[0].checkInRoom();
        rooms[0].checkOutRoom();
    }
}
