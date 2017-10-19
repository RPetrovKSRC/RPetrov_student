import java.util.Arrays;
import java.util.ArrayList;
import  java.util.Random;
import java.util.Scanner;

public class HW_03 {
    public static void main(String[] args) {
        //task_01();
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
        task_19();
    }

    /*
    1) Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
    отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
    Перед созданием массива подумайте, какого он будет размера. 2 4 6 … 18 20 2 4 6 … 20
     */
    public static void task_01() {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    /*
    2) Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
    а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
    */
    public static void task_02() {
        int[] arr = new int[50];

        arr[0] = 1;
        for (int i = 1; i <= arr.length-1; i++) {
            arr[i] = arr[i-1] + 2;
        }

        for (int i: arr){
            System.out.print(i + " ");
        }

        System.out.println("");

        for (int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }

    /*
    3) Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
    Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
    */
    public static void task_03() {
        int[] arr = new int[15];
        Random rand = new Random();
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");

            if (arr[i] != 0 && arr[i] % 2 == 0) count++;
        }
        System.out.println("\n" + count);
    }

    /*
    4) Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
    Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
    */
    public static void task_04() {
        int[] arr = new int[8];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(11);
            System.out.print(arr[i] + " ");
        }

        for (int i = 1; i < arr.length; i = i+2){
            arr[i] = 0;
        }

        System.out.println("");

        for (int i : arr ){
            System.out.print(i + " ");
        }
    }

    /*
    5) Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в
    двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для
    какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
    */
     public static void task_05() {
         int[] arr = new int[5];
         int[] arr1 = new int[5];

         double summ = 0;
         double summ1 = 0;

         Random rand = new Random();

         for (int i = 0; i < arr.length; i++) {
             arr[i] = rand.nextInt(6);
             summ += arr[i];
             System.out.print(arr[i] + " ");
         }

         System.out.println();

         for (int i = 0; i < arr1.length; i++) {
             arr1[i] = rand.nextInt(6);
             summ1 += arr1[i];
             System.out.print(arr1[i] + " ");
         }

         System.out.println();

         if (summ/5 > summ1/5){
             System.out.println("Среднее арифметическое 1-го массива больше (" + summ/5 + " и " +  summ1/5 +")");
         } else if (summ/5 < summ1/5){
             System.out.println("Среднее арифметическое 1-го массива меньше (" + summ/5 + " и " +  summ1/5 +")");
         } else {
             System.out.println("Среднее арифметическое обоих массивов равны " + summ/5);
         }
     }

    /*
    6) Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
    Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
    */
    public static void task_06() {
        int[] arr = new int[4];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(90) + 10;
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        if (arr[0] < arr[1] & arr[1] < arr[2] & arr[2] < arr[3]){
            System.out.println("Массив - возрастающая последовательность");
        } else {
            System.out.println("Массив - не возрастающая последовательность");
        }
    }
    /*
    7) Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем, что
    первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
    */
    public static void task_07() {
        int[] arr = new int[20];
        arr[0] = arr[1] = 1;

        for (int i = 2; i < 20; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /*
    8) Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является
     в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
    */
    public static void task_08() {
        int[] arr = new int[12];
        Random rand = new Random();
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(31) - 15;
            System.out.print(arr[i] + " ");
        }

        int max = arr[0];
        for ( int i = 1; i < arr.length; i++){
            if (max < arr[i] | max == arr[i]){
                max = arr[i];
                index = i;
            }
        }

        System.out.println( "\n(max = " + max + ") Индекс последнего вхождения в массив - " + index );
    }

    /*
    9) Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10
    действительных чисел. Каждый элемент с i-ым индексом третьего массива должен равняться отношению
    элемента из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом.
    Вывести все три массива на экран (каждый на отдельной строке),
    затем вывести количество целых элементов в третьем массиве.
    */
    public static void task_09() {
        StringBuilder sb1= new StringBuilder(), sb2 = new StringBuilder(), sb3 = new StringBuilder();
        int[] arr1 = new int[10], arr2 = new int[10];
        double[] arr3 = new double[10];
        int count = 0;
        Random rand = new Random();


        for (int i = 0; i < arr1.length; i++){
            arr1[i] = rand.nextInt(9) + 1;
            arr2[i] = rand.nextInt(9) + 1;
            arr3[i] = ((double)arr1[i]/(double)arr2[i]);

            if (arr3[i]%1 == 0)
                count++;
            sb1.append(arr1[i] + "   ");
            sb2.append(arr2[i] + "   ");
            sb3.append(arr3[i] + " ");
        }

        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
        System.out.println(sb3.toString());
        System.out.println("Целых элементов в третьем массиве - " + count);

    }

    /*
    10) Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
    Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
    Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
    */
    public static void task_10() {
        int[] arr = new int[11];
        int[] countArr = new int[3];
        Random rand = new Random();
        StringBuilder sb1= new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(3) - 1;
            sb1.append(arr[i] + " ");
            switch (arr[i]) {
                case -1:
                    countArr[0] = countArr[0]+1;
                    break;
                case 0:
                    countArr[1]++;//= 1;
                    break;
                case 1:
                    countArr[2]++;//= 1;
            }
        }
        System.out.println(sb1.toString());

        if (countArr[0] > countArr[1] & countArr[0] > countArr[2] & countArr[1] != countArr[2]) {
            System.out.println("-1 встречается чаще всего");
        } else if (countArr[1] > countArr[0] & countArr[1] > countArr[2] & countArr[0] != countArr[2]) {
            System.out.println("0 встречается чаще всего");
        } else if (countArr[2] > countArr[1] & countArr[2] > countArr[0] & countArr[0] != countArr[1]) {
            System.out.println("1 встречается чаще всего");
        }
}

    /*
    11) Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать
    массив указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку.
    После этого программа должна определить и сообщить пользователю о том, сумма модулей какой
    половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны.
    Если пользователь введёт неподходящее число, то программа должна требовать повторного
    ввода до тех пор, пока не будет указано корректное значение.
     */
    public static void task_11() {
        Scanner sc;
        int n = 0;
        int[] arr;
        StringBuilder sb;
        int sMod1 = 0, sMod2 = 0;
        Random rand = new Random();

        do {
            sc = new Scanner(System.in);
            System.out.print("Введите чётное положительное число: ");
            if(sc.hasNextInt()) {
              n = sc.nextInt();
            }
        } while (n <= 0 || n%2 != 0 );

        sb = new StringBuilder();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(6) - 5;
            sb.append(arr[i] + " ");
        }

        System.out.println(sb.toString());
        for (int i = 0; i < arr.length; i++) {
            if (i <= n/2-1){
                sMod1 += Math.abs(arr[i]);
            } else {
                sMod2 += Math.abs(arr[i]);
            }
        }

        if(sMod1 > sMod2){
            System.out.println("Сумма модулей левой половины массива больше");
        } else if(sMod1 < sMod2){
            System.out.println("Сумма модулей правой половины массива больше");
        } else {
            System.out.println("Суммы модулей обеих половин массива равны");
        }
    }

    /*
    12) Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,
    чтобы отрицательных и положительных элементов там было поровну и не было нулей. При этом порядок
    следования элементов должен быть случаен (т. е. не подходит вариант, когда в массиве постоянно
    выпадает сначала 6 положительных, а потом 6 отрицательных чисел или же когда элементы постоянно
    чередуются через один и пр.). Вывести полученный массив на экран.
    */
    public static void task_12() {
        int[] arr = new int[12];
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        int countPlus = 0, countMinus = 0;

        for (int i = 0; i < arr.length; i++) {
            do {
                arr[i] = rand.nextInt(21) - 10;
            } while (arr[i] == 0);

            if ((countMinus >= 6 && arr[i] < 0) || (countPlus >= 6 && arr[i] > 0)) arr[i] = arr[i] * -1;

            if (arr[i] > 0) {
                countPlus++;
            } else {
                countMinus++;
            }

            sb.append(arr[i] + " ");
        }
        System.out.println(sb.toString());
    }

    /*
    13) Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
    Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
    Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран. Создать второй
    массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
    */
    public static void task_13() {
        Scanner sc;
        int n = 0;
        int[] arr;
        int[] arr1;
        StringBuilder sb, sb1;
        int j = 0;
        Random rand = new Random();

        do {
            sc = new Scanner(System.in);
            System.out.print("Введите натуральное число большее 3: ");
            if(sc.hasNextInt()) {
                n = sc.nextInt();
            }
        } while (n <= 3 );

        sb = new StringBuilder();
        sb1 = new StringBuilder();
        arr = new int[n];
        arr1 = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(n+1);
            sb.append(arr[i] + " ");
            if( arr[i]%2 == 0){
                arr1[j] = arr[i];
                sb1.append(arr1[j] + " ");
                j++;
            }
        }
        System.out.println(sb.toString());
        System.out.println(sb1.toString());
    }

    /*
    1) Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
    Вывести массив на экран.
    */
    public static void task_14() {
        int[][] arr = new int[8][5];
        Random rand = new Random();
        StringBuilder sb;

        for(int i = 0;  i < 8; i++){
            sb = new StringBuilder();
            for(int j = 0; j < 5; j++){
                arr[i][j] = rand.nextInt(110)-10;
                sb.append(arr[i][j] + "\t");
            }
            System.out.println(sb.toString());
        }
    }

    /*
    2) Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
    Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого
    массива (его индекс не имеет значения).
    */
    public static void task_15() {
        int[][] arr = new int[5][8];
        Random rand = new Random();
        StringBuilder sb;
        int max = 0;

        for(int i = 0;  i < 5; i++){
            sb = new StringBuilder();
            for(int j = 0; j < 8; j++){
                arr[i][j] = rand.nextInt(199)-99;
                if (arr[i][j] > max) max = arr[i][j];
                sb.append(arr[i][j] + "\t\t");
            }
            System.out.println(sb.toString());
        }
        System.out.println("Max = " + max);
    }

    /*
    3) Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
    Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением
    элементов. Если таких строк несколько, то вывести индекс первой встретившейся из них.
    */
    public static void task_16() {
        int[][] arr = new int[7][4];
        Random rand = new Random();
        StringBuilder sb;
        int max = 0;
        int max1 = 1;
        int lineIndex = 0;

        for(int i = 0;  i < 7; i++){
            sb = new StringBuilder();
            for(int j = 0; j < 4; j++){
                arr[i][j] = rand.nextInt(11)-5;
                max1 *= Math.abs(arr[i][j]);
                sb.append(arr[i][j] + "\t");
            }
            System.out.println(sb.toString());
            if (max1 > max){
                max = max1;
                lineIndex = i;
            }
            max1 = 1;
        }
        System.out.println("Индекс строки с наибольшим произведением - " + lineIndex);
    }

    /*
    4) Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
    Вывести массив на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке
    стоял её наибольший элемент. При этом изменять состав массива нельзя, а можно только переставлять
    элементы в рамках одной строки. Порядок остальных элементов строки не важен (т.е. можно соврешить
    только одну перестановку, а можно отсортировать по убыванию каждую строку).
    Вывести преобразованный массив на экран.
    */
    public static void task_17() {
        int[][] arr = new int[6][7];
        Random rand = new Random();
        StringBuilder sb;

        for(int i = 0;  i < 6; i++){
            sb = new StringBuilder();
            for(int j = 0; j < 7; j++){
                arr[i][j] = rand.nextInt(10);
                sb.append(arr[i][j] + "\t");
            }
            System.out.println(sb.toString());
        }

        for(int i = 0;  i < 6; i++){
            int max = arr[i][0];
            int j;
            int index = 0;
            for(j = 1 ; j < 7; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                    index = j;
                }
            }

            if (index > 0) {
                int tmp = arr[i][0];
                arr[i][0] = arr[i][index];
                arr[i][index] = tmp;
            }
        }

        System.out.println();
        for(int i = 0;  i < 6; i++){
            sb = new StringBuilder();
            for(int j = 0; j < 7; j++){
                sb.append(arr[i][j] + "\t");
            }
            System.out.println(sb.toString());
        }
    }

    /*
    5) Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать
    каждый урок с того, чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек,
    а примеры среди них не должны повторяться. В помощь учителю напишите программу, которая будет выводить
    на экран 15 случайных примеров из таблицы умножения (от 2*2 до 9*9, потому что задания по умножению
    на 1 и на 10 — слишком просты). При этом среди 15 примеров не должно быть повторяющихся
    (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).
     */
    public static void task_18() {
        ArrayList<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        String xy, yx;

        for (int i = 0; i < 15; i++) {
            do {
                int x = rand.nextInt(8) + 2;
                int y = rand.nextInt(8) + 2;
                xy = x + "*" + y;
                yx = y + "*" + x;
            } while (list.indexOf(xy) > -1 || list.indexOf(yx) > -1);

            list.add(xy);
        }

        for (int i = 0; i < 15; i++) {
            sb.append(list.get(i) + " ");
        }

        System.out.println(sb.toString());
    }

    /* Крипто*/
    public static void task_19() {
        Scanner input = new Scanner(System.in);
        byte[] msg = null, msgEnc, msgDec, key = null, msgKey;


        System.out.print("Введите сообщение для шифрования: ");
        if (input.hasNextLine()) msg = input.nextLine().getBytes();

        System.out.print("Введите ключ: ");
        if (input.hasNextLine()) key = input.nextLine().getBytes();

        System.out.println("");
        msgKey = new byte[msg.length];
        msgEnc = new byte[msg.length];
        msgDec = new byte[msg.length];

        for (int m = 0; m < msgKey.length; m++) {
            int index = m;
            if (m >= key.length){
                index = (m) % key.length;
            }
            msgKey[m] = key[index];
        }

        for (int m = 0; m < msg.length; m++) msgEnc[m] = (byte) (msg[m] ^ msgKey[m]);
        StringBuilder sb = new StringBuilder();
        sb.append("Шифрованое сообщение - ");
        sb.append(new String(msgEnc));
        System.out.println(sb.toString());

        for (int m = 0; m < msg.length; m++) msgDec[m] = (byte) (msgEnc[m] ^ msgKey[m]);
        System.out.println("Дешифрованое сообщение - " + new String(msgDec));
    }

}
