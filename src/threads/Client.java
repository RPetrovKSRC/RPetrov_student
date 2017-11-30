package threads;

public class Client extends Thread {
    private Restaurant.Order order;
    public Client(Restaurant.Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        super.run();
    }
}
