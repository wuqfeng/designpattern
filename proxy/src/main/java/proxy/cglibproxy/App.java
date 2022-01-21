package proxy.cglibproxy;

public class App {
    public static void main(String[] args) {
        UserDao target=new UserDao();
        UserDao proxyInstance = (UserDao) new ProxyFactory(target).getProxyInstance();
        proxyInstance.save();
    }
}
