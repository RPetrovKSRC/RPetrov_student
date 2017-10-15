/*
Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 */
public class HW_02_11 {
    public static void main(String[] args) {
        int j =2;
        for (int i =1; i<21; i++) {
            System.out.println(j);
            j = j * 2;
        }
    }
}
