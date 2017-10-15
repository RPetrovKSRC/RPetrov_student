/*
Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число
и его наибольшую цифру. Примеры работы программы: 
В числе 208 наибольшая цифра 8 В числе 774 наибольшая цифра 7 В числе 613 наибольшая цифра 6
 */
import java.util.Random;

public class HW_02_05 {
    public static void main(String[] args) {
        int rnd = (int) (Math.random() * 1000);
        int max, ostatok ;

        max = rnd/100;
        ostatok = rnd%100;

        if (max < ostatok/10) max = ostatok/10;
        if (max < ostatok%10) max = ostatok%10;

        System.out.println("В числе - " + rnd + " наибольшая цифра  - "  +max);
    }
}
