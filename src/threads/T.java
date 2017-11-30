package threads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T extends Thread {
    private final List<String> words;
    private final Map<String, Integer> map = new HashMap<>();

    public T (List<String> words) {
        this.words = words;
    }
    @Override
    public void run() {

    }
}