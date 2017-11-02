package old;

public class HW_01 {

    public static void main(String[] args) {
        Task_01();
        //Task_02();
        //Task_03();
        //Task_04();
        //Task_05();
    }

    public static void Task_01() {
        int q, w;
        q = 21;
        w = 8;

        System.out.println(q + " / " + w + " = " + q / w + " и " + q % w + " в остатке");
    }

    public static void Task_02() {
        int n, ten, first, second;
        n = 28;
        ten = 10;
        first = n / ten;
        second = n % ten;

        System.out.println("n = " + n);
        System.out.println("Сумма = " + (first + second));
    }

    public static void Task_03() {
        double pi = 3.14;

        System.out.println("Если округлить, то получим " + Math.round(pi));
    }

    public static void Task_04() {
        int n, ten, hundred, first, ostatok;
        n = 285;
        ten = 10;
        hundred = ten * 10;
        first = n / hundred;
        ostatok = n % hundred;

        System.out.println("n = " + n);
        System.out.println("Сумма = " + (first + ostatok / ten + ostatok % ten));
    }

    public static void Task_05() {
        int n, ten, first, second;
        n = 28;
        ten = 10;
        first = n / ten;
        second = n % ten;

        System.out.println("n = " + n);
        System.out.println("Сумма = " + (first + second));
    }
}