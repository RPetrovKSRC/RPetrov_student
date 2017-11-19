package patterns;

public class FactorySingleton {
    private static Factory jpFactory;
    private static Factory deFactory;
    private static Factory ruFactory;
    private static FactorySingleton instance;

    private FactorySingleton() {
    }

    public static Factory getFactory(String region) {
        if (instance == null) {
            instance = new FactorySingleton();
        }

        if (region.toUpperCase().equals("JP")) {
            if (jpFactory == null) {
                jpFactory = new JapanFactory();
            }
            return jpFactory;

        } else if (region.toUpperCase().equals("DE")) {
            if (deFactory == null) {
                deFactory = new GermanFactory();
            }
            return deFactory;

        } else {
            if (ruFactory == null) {
                ruFactory = new RussianFactory();
            }
            return ruFactory;
        }
    }
}
