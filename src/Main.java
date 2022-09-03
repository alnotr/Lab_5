import work.*;

public class Main {
    public static void main(String[] args) {
        Parser.start();
        final Manager collectionManager = new Manager();
        final Invoker invoker = new Invoker(collectionManager);
        Receiver receiver = new Receiver(collectionManager, invoker);
        receiver.start();
    }
}