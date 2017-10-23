package hw05;

public class Square extends Rectangle {
    int h;

    public void getPerimetrLength() {
        System.out.println(new StringBuilder().append("Периметр квадрата : ").append(h * 4).append(" ед.").toString());
    }

    public void getSquare() {
        System.out.println(new StringBuilder().append("Площадь квадрата : ").append(h * h).append(" кв. ед.").toString());
    }
}
