package patterns;

public class SensorMain {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.subscribe(new Green(100));
        sensor.subscribe(new Yellow(200));
        sensor.subscribe(new Red(500));

        for (int i = 0; i < 550; i = i + 50) {
            sensor.currentTemperature(i);
        }

        for (int i = 550; i > 50; i = i - 50) {
            sensor.currentTemperature(i);
        }

        for (int i = 50; i < 550; i = i + 50) {
            sensor.currentTemperature(i);
        }
    }
}
