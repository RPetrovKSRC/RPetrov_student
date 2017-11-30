package threads;

public class Waiter extends Thread {
    private Restaurant.Order order;
    public Waiter(Restaurant.Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        super.run();
    }
}
