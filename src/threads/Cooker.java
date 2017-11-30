package threads;

public class Cooker extends Thread {
    private Restaurant.Order order;
    public Cooker(Restaurant.Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        super.run();
    }
}
