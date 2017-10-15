/*
Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается
так, что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия (например,
02:20, 11:11 или 15:51).
 */
public class HW_02_19 {
    public static void main(String[] args){
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
}
