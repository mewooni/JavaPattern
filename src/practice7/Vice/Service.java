package practice7.Vice;

public class Service implements ServiceInterface{
    public Service(){};
    @Override
    public void action() {
        System.out.println("Service Method call!");
    }
}
