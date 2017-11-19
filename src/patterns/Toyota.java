package patterns;

public class Toyota implements Car {
    @Override
    public int drive(int distanse, int fuel) {
        int consumption = 14;

        int range = 100 * fuel / consumption;
        return (distanse < range ? distanse : range);
    }
}
