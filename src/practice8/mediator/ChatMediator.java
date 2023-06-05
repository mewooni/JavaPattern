package practice8.mediator;

public interface ChatMediator {
    public void sendMessage(String msg, User user);

    void addUser(User user);
}
