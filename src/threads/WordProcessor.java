package threads;

import java.util.List;

public class WordProcessor {
    static int cpus = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        System.out.println(cpus);
    }


    /**
     * Customer == main treaad
     * Waiter
     * Cooker
     */
}