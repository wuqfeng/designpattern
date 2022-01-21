package proxy.staticproxy;

import proxy.common.IUserDao;
import proxy.common.UserDao;

public class App {
    public static void main(String[] args){
        IUserDao target=new UserDao();
        UserDaoProxy proxy=new UserDaoProxy(target);
        proxy.save();
    }
}
