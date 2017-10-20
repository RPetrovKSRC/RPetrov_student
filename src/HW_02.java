import java.util.Random;
import java.util.Scanner;

public class HW_02 {
    public static void main(String[] args) {
        task_01();
        //task_02();
        //task_03();
        //task_04();
        //task_05();
        //task_06();
        //task_07();
        //task_08();
        //task_09();
        //task_10();
        //task_11();
        //task_12();
        //task_13();
        //task_14();
        //task_15();
        //task_16();
        //task_17();
        //task_18();
        //task_19();
        //task_20();
    }

    public static void task_01() {
        int n = 34;

        if (n % 2 == 0)
            System.out.println(n + " - чётное");
        else
            System.out.println(n + " - нечётное");
    }

    public static void task_02() {
        int m, n, ten, res1, res2;
        m = 17;
        n = 5;
        ten = 10;

        if (ten > n)
            res1 = ten - n;
        else
            res1 = n - ten;

        res2 = ten > m ? ten - m : m - ten;

        if (res1 > res2)
            System.out.println("m = " + m + " ближе к 10 чем n = " + n);
        else
            System.out.println("n = " + n + " ближе к 10 чем m = " + m);
    }

    /*
    В три переменные a, b и c записаны три вещественных числа.  Создать программу, которая будет находить
    и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет
    */
    public static void task_03() {
        double a = 0.15, b = 6.75, c = 18.2;
        //double a = 7, b = 8, c = 11;
        double root1, root2;

        root1 = (b * (-1) + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        root2 = (b * (-1) - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        if (Double.isNaN(root1) && Double.isNaN(root2)) {
            System.out.println("Корней нет");
        } else {
            System.out.println("Корни квадратного уравнения равны " + root1 + " и " + root2);
        }
    }

    /*Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155]
      целое число в интервал (25;100) и сообщать результат на экран. Примеры работы программы: 
      Число 113 не содержится в интервале (25,100) Число 72 содержится в интервале (25,100) 
      Число 25 не содержится в интервале (25,100) Число 155 не содержится в интервале (25,100)
    */
    public static void task_04() {
        int a = 25;
        int b = 100;
        Random rand = new Random();
        int rnd = rand.nextInt(156) + 5;

        if (a <= rnd & rnd <= b)
            System.out.println("Число " + rnd + " содержится в интервале (25,100)");
        else
            System.out.println("Число " + rnd + " не содержится в интервале (25,100)");
    }

    /*
Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число
и его наибольшую цифру. Примеры работы программы: 
В числе 208 наибольшая цифра 8 В числе 774 наибольшая цифра 7 В числе 613 наибольшая цифра 6
 */
    public static void task_05()    {
        int rnd = (int) (Math.random() * 1000);
        int max, ostatok;

        max = rnd / 100;
        ostatok = rnd % 100;

        if (max < ostatok / 10) max = ostatok / 10;
        if (max < ostatok % 10) max = ostatok % 10;

        System.out.println("В числе - " + rnd + " наибольшая цифра  - " + max);
    }

    /* В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой
числа. Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе
на экран последовательность a, b и c оказалась строго возрастающей. 

Числа в переменных a, b и c: 3, 9, -1
Возрастающая последовательность: -1, 3, 9
 */
    public static void task_06() {
        String str = "Возрастающая последовательность:";
        int a, b, c;
        Random rand = new Random();

        do {
            a = (int) rand.nextGaussian();
        } while (a == 0);
        do {
            b = (int) rand.nextGaussian();
        } while (b == 0);
        do {
            c = (int) rand.nextGaussian();
        } while (c == 0);

        a = a * (int) (Math.random() * 100);
        b = b * (int) (Math.random() * 100);
        c = c * (int) (Math.random() * 100);

        if (a < b & b < c) System.out.println(str + a + ", " + b + ", " + c);
        else if (a < b & a < c & b > c) System.out.println(str + a + ", " + c + ", " + b);
        else if (b < a & b < c & a > c) System.out.println(str + b + ", " + c + ", " + a);
        else if (b < a & a < c) System.out.println(str + b + ", " + a + ", " + c);
        else if (c < a & a < b) System.out.println(str + c + ", " + a + ", " + b);
        else if (c < a & c < b & a > b) System.out.println(str + c + ", " + b + ", " + a);
        else if (a == b | b == c | a == c) System.out.println("Какие-то из чисел равны");
        else System.out.println("Что-то пошло не так");
    }

    /*
На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество
секунд, оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов
утра — табло отображает «28800» (т.е. остаётся 8 часов), когда времени 14:30 — на табло «9000»
(т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
(т.е. рабочий день закончился). Программист Иванов заметил, как страдают офисные
сотрудницы — им неудобно оценивать остаток рабочего дня в секундах. Иванов вызвался
помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные
фразы с информацией о том, сколько полных часов осталось до конца рабочего дня.
Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа». 
Итак, в переменную n должно записываться случайное (на время тестирования программы)
целое число из [0;28800], далее оно должно выводиться на экран (для Петрова) и на следующей
строке (для сотрудниц) должна выводиться фраза о количестве полных часов, содержащихся в n секундах. 

Примеры работы программы:

 23466
Осталось 6 часов 
 */
    public static void task_07() {
        String ost = "Осталось ";
        Random rand = new Random();
        int rnd = rand.nextInt(28801);

        System.out.println(rnd);
        int ostatok = rnd % 3600;
        int hours = rnd / 3600;

        if (hours == 0) {
            System.out.println(ost + "менее часа");
        } else {

            switch (hours) {
                case 1:
                    System.out.println("Остался 1 час");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(ost + hours + " часа");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    System.out.println(ost + hours + " часов");
                    break;
            }
        }
    }

    /*
Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
 */
    public static void task_08()  {
        for (int i = 1000; i < 9999; i = i + 3) {
            System.out.println(i);
        }
    }

    /*
   Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
    */
    public static void task_09() {
        int j = 1;
        for (int i = 1; i < 56; i++) {
            System.out.println(j);
            j = j + 2;
        }
    }

    /*
   Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
    */
    public static void task_10()  {
        for (int i = 90; i >= 0; i = i - 5) {
            System.out.println(i);
        }
    }

    /*
   Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
    */
    public static void task_11() {
        int j = 2;
        for (int i = 1; i < 21; i++) {
            System.out.println(j);
            j = j * 2;
        }
    }

    /*
   Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
    */
    public static void task_12() {
        long n = 0;
        long res = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                res = res * i;
            }

        }
        System.out.print("Факториал числа " + n + " равен " + res);
    }

    /*
   Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
    */
    public static void task_13() {
        long n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) System.out.println(i);
            }

        }
    }

    /*
   Проверьте, является ли введённое пользователем с клавиатуры натуральное число — простым.
   Постарайтесь не выполнять лишних действий (например, после того, как вы нашли хотя бы один нетривиальный
   делитель уже ясно, что число составное и проверку продолжать не нужно). Также учтите, что наименьший
   делитель натурального числа n, если он вообще имеется, обязательно располагается в отрезке [2; √n]
   */
    public static void task_14() {
        long n;
        boolean isSimple = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();

            if (n == 2) {
                System.out.println("Введенное число 2 простое");
            } else {
                if (n % 2 == 0) {
                    isSimple = false;
                } else {

                    for (int i = 3; i <= Math.sqrt(n); i++) {
                        if (n % i == 0) {
                            isSimple = false;
                            break;
                        }
                    }
                }

                if (isSimple) {
                    System.out.println("Введенное число " + n + " простое");
                } else {
                    System.out.println("Введенное число " + n + " не является простым");
                }
            }
        }
    }

    /*
   02 15  + 8) Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что первый и второй
   члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
   */
    public static void task_15() {
        int prev = 1, next = 1, summ;
        System.out.println(1 + "\n" + 1);

        for (int i = 3; i < 12; i++) {
            summ = prev + next;
            System.out.println(prev + next);
            prev = next;
            next = summ;
        }
    }

    /*
Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
(заранее не известно сколько цифр будет в числе).
 */
    public static void task_16(){
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

    /*
В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное
депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999. «Счастливым»
считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как,
например, в билетах с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю
каждого счастливого билета и теперь раздумывает, как много сувениров потребуется. С помощью программы
подсчитайте сколько счастливых билетов в одном рулоне?
 */
    public static void task_17() {
        int sumLeft, sumRight, res=0;
        String nStr;
        for (long n=1;n<=999999; n++){
            nStr = Long.toString(n);

            switch (nStr.length()) {
                case 1:
                    nStr = "00000" + nStr;
                    break;
                case 2:
                    nStr = "0000" + nStr;
                    break;
                case 3:
                    nStr = "000" + nStr;
                    break;
                case 4:
                    nStr = "00" + nStr;
                    break;
                case 5:
                    nStr = "0" + nStr;
            }
            //System.out.println(nStr);

            sumLeft = Integer.valueOf(nStr.charAt(0)) + Integer.valueOf(nStr.charAt(1)) + Integer.valueOf(nStr.charAt(2));
            sumRight = Integer.valueOf(nStr.charAt(3)) + Integer.valueOf(nStr.charAt(4)) + Integer.valueOf(nStr.charAt(5));

            if (sumLeft == sumRight){
                res++;
                //System.out.println(">>> " + nStr);
            }
        }
        System.out.println("В одном рулоне счастливых билетов - " +res);
    }

    /*
В городе N есть большой склад на котором существует 50000 различных полок. Для удобства работников
руководство склада решило заказать для каждой полки табличку с номером от 00001 до 50000 в местной типографии,
но когда таблички напечатали, оказалось что печатный станок из-за неисправности не печатал цифру 2,
поэтому все таблички, в номерах которых содержалась одна или более двойка (например, 00002 или 20202) —
надо перепечатывать. Напишите программу, которая подсчитает сколько всего таких ошибочных табличек оказалось
в бракованной партии.
 */
    public static void task_18(){
        String tmpStr;
        int j=0;
        for(long i=1; i<=50000;i++){
            tmpStr = Long.toString(i);
            if(tmpStr.contains("2")) j++;
        }
        System.out.println("Ошибочных табличек оказалось - " + j);
    }

    /*
Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается
так, что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия (например,
02:20, 11:11 или 15:51).
 */
    public static void task_19(){
        String hours, mins, mins1;
        int res = 0;

        for (int h = 0; h < 24; h++){
            hours = Integer.toString(h);
            if (hours.length() == 1) hours = "0" + hours;

            metka:
            for (int m = 0; m < 60; m++) {
                mins = Integer.toString(m);
                if (mins.length() == 1) mins = "0" + mins;

                mins1 = String.valueOf(mins.charAt(1)) + String.valueOf(mins.charAt(0));
                //System.out.println( hours + ":" + mins);
                if (hours.equals(mins1)) {
                    System.out.println("Искомая комбинация " + hours + ":" + mins);
                    res++;
                    break metka;
                }
            }
        }
        System.out.println("Симметричная комбинация повторилась " + res + " раз");
    }

    /*
В американской армии считается несчастливым число 13, а в японской — 4. Перед международными учениями
штаб российской армии решил исключить номера боевой техники, содержащие числа 4 или 13 (например, 40123,
13313, 12345 или 13040), чтобы не смущать иностранных коллег. Если в распоряжении армии имеется 100 тыс.
единиц боевой техники и каждая боевая машина имеет номер от 00001 до 99999, то сколько всего номеров придётся исключить?
*/
    public static void task_20() {
        String tmpStr;
        int j=0;
        for(long i=1; i<=99999;i++){
            tmpStr = Long.toString(i);
            if(tmpStr.contains("4") || tmpStr.contains("13")) j++;
        }
        System.out.println("Придётся исключить номеров - " + j);

    }
}
