/*
В три переменные a, b и c записаны три вещественных числа.  Создать программу, которая будет находить
и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет
*/
public class HW_02_03 {
    public static void main(String[] args) {
        double a = 0.15, b = 6.75, c = 18.2;
        //double a = 7, b = 8, c = 11;
        double root1, root2;

        root1 = (b*(-1) + Math.sqrt(b*b - 4*a*c))/(2*a);
        root2 = (b*(-1) - Math.sqrt(b*b - 4*a*c))/(2*a);

        if (Double.isNaN(root1) && Double.isNaN(root2)) {
            System.out.println("Корней нет");
        } else {
            System.out.println("Корни квадратного уравнения равны " + root1 + " и " + root2);
        }
    }
}
