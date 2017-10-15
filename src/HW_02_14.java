import java.util.Scanner;

/*
Проверьте, является ли введённое пользователем с клавиатуры натуральное число — простым.
Постарайтесь не выполнять лишних действий (например, после того, как вы нашли хотя бы один нетривиальный
делитель уже ясно, что число составное и проверку продолжать не нужно). Также учтите, что наименьший
делитель натурального числа n, если он вообще имеется, обязательно располагается в отрезке [2; √n]
*/
public class HW_02_14 {
    public static void main(String[] args) {
        long n;
        boolean isSimple = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        if(sc.hasNextInt()) {
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
}
