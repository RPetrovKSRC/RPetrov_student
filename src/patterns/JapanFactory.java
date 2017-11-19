package patterns;

public class JapanFactory extends Factory {
    @Override
    Car createCar() {
        return new Toyota();
    }
}
