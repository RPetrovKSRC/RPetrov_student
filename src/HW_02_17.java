/*
В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное
депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999. «Счастливым»
считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как,
например, в билетах с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю
каждого счастливого билета и теперь раздумывает, как много сувениров потребуется. С помощью программы
подсчитайте сколько счастливых билетов в одном рулоне?
 */
public class HW_02_17 {
    public static void main(String[] args) {
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
}
