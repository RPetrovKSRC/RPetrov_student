/*
Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
 */
import java.util.Scanner;
public class HW_02_13 {
    public static void main(String[] args) {
        long n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        if(sc.hasNextInt()) {
            n = sc.nextInt();
            for(int i=1;i<=n;i++){
                if (n%i == 0)  System.out.println(i);
            }

        }
    }
}
