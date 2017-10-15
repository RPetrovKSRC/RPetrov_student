/*
Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

 */
public class HW_02_09 {
    public static void main(String[] args) {
        int j =1;
        for (int i =1; i<56; i++) {
            System.out.println(j);
            j = j + 2;
        }
    }
}
