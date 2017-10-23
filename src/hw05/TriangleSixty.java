package hw05;

public class TriangleSixty extends Triangle {

    @Override
    public void getPerimetrLength() {
        System.out.println(new StringBuilder().append("Периметр треугольника : ").append(a*3).append(" ед.").toString());
    }

    @Override
    public void getSquare() {
        System.out.println(new StringBuilder().append("Площадь треугольника : ").append((Math.sqrt(3) * (a * a)) / 4).append(" кв. ед.").toString());
    }
}
