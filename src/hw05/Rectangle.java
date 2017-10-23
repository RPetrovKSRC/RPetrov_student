package hw05;

public class Rectangle extends Shape {
    int h;
    int w;

    public void getPerimetrLength() {
        System.out.println(new StringBuilder().append("Периметр прямоугольника : ").append((h + w) * 2).append(" ед.").toString());
        //return (h + w) * 2;
    }

    public void getSquare() {
        System.out.println(new StringBuilder().append("Площадь прямоугольника : ").append(h * w).append(" кв. ед.").toString());
    }
}
