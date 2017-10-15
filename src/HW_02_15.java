/*
02 15  + 8) Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что первый и второй
члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
*/
 public class HW_02_15 {
    public static void main(String[] args){
        int prev=1, next=1, summ;
        System.out.println(1 + "\n" + 1);

        for(int i=3;i<12;i++){
            summ = prev+next;
        System.out.println(prev+next);
                prev = next;
            next = summ;
        }
        }
}
