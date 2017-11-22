package patterns;

public interface Alarm {
    void publish(int temperature);
}

abstract class AbstractAlarm implements Alarm {
    boolean blink;
    int margin;

    @Override
    public void publish(int temperature) {
    }
}

class Green extends AbstractAlarm {

    public Green(int margin) {
        this.margin = margin;
    }

    @Override
    public void publish(int temperature) {
        if (!blink & temperature > margin) {
            System.out.println("Green Alarm");
            blink = true;
        } else if(blink & temperature >= margin) {
            blink = false;
        }
    }
}

class Yellow extends AbstractAlarm {

    public Yellow(int margin) {
        this.margin = margin;
    }

    @Override
    public void publish(int temperature) {
        if (!blink & temperature >= margin) {
            System.out.println("Yellow Alarm");
            blink = true;
        } else if(blink & temperature < margin) {
            blink = false;
        }
    }
}

class Red extends AbstractAlarm {
    public Red(int margin) {
        this.margin = margin;
    }

    @Override
    public void publish(int temperature) {
        if (!blink & temperature >= margin) {
            System.out.println("Red Alarm");
            blink = true;
        } else if(blink & temperature < margin) {
            blink = false;
        }
    }
}
