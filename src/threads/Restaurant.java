package threads;

public class Restaurant {
    final Order order = new Order();
    boolean isReadyOrder;
    boolean isNeedDeliverOrder;
    boolean isNeedPizza;
    boolean isReadyPizza;
    boolean isReadyToEat;
    boolean close;
    int i;

    public void open() throws InterruptedException {
        Client client = new Client(order) {
            @Override
            public void run() {
                while (!isInterrupted()) {
                    synchronized (order) {
                        if (close) interrupt();
                        try {
                         //  if (false) order.wait();
                            if (!isReadyOrder && !isReadyToEat) {
                                System.out.println("Client make order");
                                isNeedDeliverOrder = true;
                                isReadyOrder = true;
                            }

                            if (isReadyToEat) {
                                System.out.println("Client Yamm-yamm");
                                System.out.println("- - - - - - - - - - -");
                                isReadyOrder = false;
                                isReadyToEat = false;
                                sleep(5000);
                                i++;
                                if (i == 2) {
                                    close = true;
                                }
                            }
                            order.notifyAll();
                        } catch (InterruptedException e) {
                            interrupt();
                        }

                    }
                }
            }
        };
        client.setName("Client");

        Waiter waiter = new Waiter(order) {
            @Override
            public void run() {
                while (!isInterrupted()) {
                    synchronized (order) {
                        if (close) interrupt();
                        try {

                            order.wait();
                            if (isNeedDeliverOrder) {
                                System.out.println("Waiter Deliver order to cooker");
                                isNeedDeliverOrder = false;
                                isNeedPizza = true;
                            }

                            if (isReadyPizza) {
                                System.out.println("Waiter Deliver pizza to client");
                                isReadyPizza = false;
                                isReadyToEat = true;
                            }
                            order.notifyAll();

                        } catch (InterruptedException e) {
                            interrupt();
                        }

                    }
                }
            }
        };
        waiter.setName("Waiter");

        Cooker cooker = new Cooker(order) {
            @Override
            public void run() {
                while (!isInterrupted()) {
                    synchronized (order) {
                        if (close) interrupt();
                        try {
                            order.wait();
                            if (isNeedPizza) {
                                System.out.println("Coocking pizza...");
                                sleep(2000);
                                System.out.println("Hot pizza is ready");
                                isNeedPizza = false;
                                isReadyPizza = true;
                            }
                            order.notifyAll();
                        } catch (InterruptedException e) {
                            interrupt();
                        }

                    }
                }
            }
        };
        cooker.setName("Cooker");

        waiter.start();
        cooker.start();
        client.start();
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        try {
            r.open();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public class Order {
        String name = "pizza";
    }
}
