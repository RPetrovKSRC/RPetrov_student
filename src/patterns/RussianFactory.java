package patterns;

public class RussianFactory extends Factory {
    @Override
    Car createCar() {
        return new VAZ();
    }
}
