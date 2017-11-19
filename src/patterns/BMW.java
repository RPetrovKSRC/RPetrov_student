package patterns;

public class BMW implements Car {
    @Override
    public int drive(int distanse, int fuel) {
        int consumption = 20;

        int range = 100 * fuel / consumption;
        return (distanse < range ? distanse : range);
    }
}
