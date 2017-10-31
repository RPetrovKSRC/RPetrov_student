package hw05;

public class Ellipse implements Shape {
    int a;
    int b;

    public void getPerimetrLength() {
        System.out.println(new StringBuilder().append("Периметр эллипса : ").append(Math.PI + (a + b)).append(" ед.").toString());
    }

    public void getSquare() {
        double result = ((Math.PI + (a + b) + Math.pow(a - b, 2)) / (a + b)) * 4;
        System.out.println(new StringBuilder().append("Площадь эллипса : ").append(result).append(" кв. ед.").toString());
    }
}
