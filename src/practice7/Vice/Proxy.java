package practice7.Vice;

public class Proxy implements ServiceInterface{
    private Service realService;

    public Proxy(Service realService) {
        this.realService = realService;
    }

    public Proxy(){};

    @Override
    public void action() {
        if(realService == null) {
            realService = new Service();
        }
        System.out.println("Method call from proxy, redirect to service.");
        realService.action();
    }
}
