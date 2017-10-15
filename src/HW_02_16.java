/*
Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
(заранее не известно сколько цифр будет в числе).
 */
import java.util.Scanner;
public class HW_02_16 {
    public static void main(String[] args){
        long n;
        int summ = 0;
        String nStr;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");

        if(sc.hasNextInt()) {
            n = sc.nextInt();
            nStr = Long.toString(n);

            for (int i=0; i<nStr.length(); i++){
                summ = summ +  Character.getNumericValue(nStr.charAt(i));
            }
            System.out.print("Сумма цифр числа " + n + " равна - " +summ);
        }
    }
}
