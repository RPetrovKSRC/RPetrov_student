package hw05;

public class Triangle implements Shape {
    int a; // основание
    int h; // высота

    public void getPerimetrLength() {
        System.out.println(new StringBuilder().append("Периметр треугольника : ").append("").append(" ед.").toString());
    }

    public void getSquare() {
        System.out.println(new StringBuilder().append("Площадь треугольника : ").append((a * h) / 2).append(" кв. ед.").toString());
    }
}
