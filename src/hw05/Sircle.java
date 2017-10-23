package hw05;

public class Sircle extends Ellipse {
    int r;

    public void getPerimetrLength() {
        System.out.println(new StringBuilder().append("Периметр окружности : ").append(Math.PI * 2 * r ).append(" ед.").toString());
    }

    public void getSquare() {
        System.out.println(new StringBuilder().append("Площадь окружности : ").append(Math.PI * (r * r) ).append(" кв. ед.").toString());
    }
}
