import java.util.Scanner;

/*
Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
 */
public class HW_02_12 {
    public static void main(String[] args) {
        long n=0;
        long res=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        if(sc.hasNextInt()) {
            n = sc.nextInt();
            for(int i=1;i<=n;i++){
                res = res* i;
            }

        }
        System.out.print("Факториал числа " + n + " равен " + res);
    }
}
