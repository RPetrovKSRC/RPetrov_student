package patterns;

public class GermanFactory extends Factory {
    @Override
    Car createCar() {
        return new BMW();
    }
}
