/* В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой
числа. Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе
на экран последовательность a, b и c оказалась строго возрастающей. 

Числа в переменных a, b и c: 3, 9, -1
Возрастающая последовательность: -1, 3, 9
*
 */
import java.util.Random;
public class HW_02_06 {
    public static void main(String[] args) {
        String str = "Возрастающая последовательность:";
        int a,b,c;
        Random rand = new Random();

        do{
            a = (int) rand.nextGaussian();
        }  while (a ==0);
        do{
            b = (int) rand.nextGaussian();
        }  while (b ==0);
        do{
            c = (int) rand.nextGaussian();
        }  while (c ==0);

        a= a* (int) (Math.random() *100);
        b= b* (int) (Math.random() *100);
        c= c* (int) (Math.random() *100);

        if      (a<b & b<c)          System.out.println(str + a + ", " + b + ", " + c);
        else if (a<b & a<c & b>c )   System.out.println(str + a + ", " + c + ", " + b);
        else if (b<a & b<c & a>c)    System.out.println(str + b + ", " + c + ", " + a);
        else if (b<a & a<c)          System.out.println(str + b + ", " + a + ", " + c);
        else if (c<a & a<b)          System.out.println(str + c + ", " + a + ", " + b);
        else if (c<a & c<b & a>b)    System.out.println(str + c + ", " + b + ", " + a);
        else if (a==b | b==c | a==c) System.out.println("Какие-то из чисел равны");
        else System.out.println("Что-то пошло не так");
    }
}
