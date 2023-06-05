package practice7.Vice;

public class Client {
    public static void main(String[] args) {
        ServiceInterface proxy = new Proxy();
        proxy.action();
        ServiceInterface proxyService = new Proxy(new Service());
        ServiceInterface service = new Service();
        proxyService.action();
        service.action();
    }
}
