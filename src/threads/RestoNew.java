package threads;

public class RestoNew {
    public static void main(String[] args) {
        Restaurant rr = new Restaurant();
        Restaurant.Order order = rr.order;
    }
/*
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
        */
}
