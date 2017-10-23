package hw05;

public class TriangleRight extends Triangle {
    @Override
    public void getPerimetrLength() {
        double hyp = Math.hypot((double) a, (double) h);
        System.out.println(new StringBuilder().append("Периметр треугольника : ").append(hyp + a + h).append(" ед.").toString());
    }
}
