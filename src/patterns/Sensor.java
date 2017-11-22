package patterns;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private List<Alarm> alarms = new ArrayList<>();

    public void subscribe(Alarm alarm) {
        alarms.add(alarm);
    }

    public void unsubscribe(Alarm alarm) {
        alarms.remove(alarm);
    }

    private void notifyListeners(int temperature) {
        for (Alarm alarm : alarms) {
            alarm.publish(temperature);
        }
    }

    public void currentTemperature(int temperature) {
        System.out.println("Current temperature - " + temperature);
        notifyListeners(temperature);
    }
}
