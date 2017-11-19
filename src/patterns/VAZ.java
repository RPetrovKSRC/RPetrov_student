package patterns;

public class VAZ implements Car {
    @Override
    public int drive(int distanse, int fuel) {
        int consumption = 8;

        int range = 100 * fuel / consumption;
        return (distanse < range ? distanse : range);
    }
}
