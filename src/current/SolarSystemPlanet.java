package current;

public enum SolarSystemPlanet {
    MERCURY(.055f, 4870, 0.4f), //.38R d = 4900
    VENUS(.815f, 12150, .7f), //d 12150
    EARTH(1f, 12756, 1f), //d 12750
    MARS(.107f, 6670, 1.5f), // d 6800
    JUPITER(318f, 143760, 5.2f), // 142800
    SATURN(95f, 120700, 9.5f), // d 120700
    URANUS(14f, 51100, 19.2f), // d 51100
    NEPTUNE(17f, 49500, 30.1f); // d 49500
    //PLUTO(0f, 2320, 39f);

    private static final int AU = 150000000; //Astronomical unit = 150000000 km
    private static final double EM = 5976E24; //*Math.pow(10,24); //Earth mass = 5976x10^24
    private final float massEM;
    private final long radiusKm;
    private final float orbitAu;

    SolarSystemPlanet(float mass, long diameter, float orbit) {
        this.massEM = mass;
        this.radiusKm = diameter/2;
        this.orbitAu = orbit;
    }

    public float getMassEM() {
        return massEM;
    }

    public long getRadiusKm() {
        return radiusKm;
    }

    public float getOrbitAu() {
        return orbitAu;
    }

    public static void main(String[] args) {
        System.out.println("Mars - " + SolarSystemPlanet.MARS.orbitAu * AU);
    }
}



