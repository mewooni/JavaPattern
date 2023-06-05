package practice8.mediator;

public class ChatClient {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Owleeng");
        User user2 = new UserImpl(mediator, "fuji!");
        User user3 = new UserImpl(mediator, "envyy");
        User user4 = new UserImpl(mediator, "fumiko!");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("what's up yall");
    }
}
