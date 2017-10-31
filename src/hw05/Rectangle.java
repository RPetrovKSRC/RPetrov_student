package hw05;

public class Rectangle implements Shape {
    int h;
    int w;
/*
    public Rectangle (int h, int w) {
        this.h = h;
        this.w = w;
    }*/

    public void getPerimetrLength() {
        System.out.println(new StringBuilder().append("Периметр прямоугольника : ").append((h + w) * 2).append(" ед.").toString());
    }

    public void getSquare() {
        System.out.println(new StringBuilder().append("Площадь прямоугольника : ").append(h * w).append(" кв. ед.").toString());
    }
}
