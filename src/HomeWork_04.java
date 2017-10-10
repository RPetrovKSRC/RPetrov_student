public class HomeWork_04 {
    public static void main(String[] args){
        int n,ten,hundred,first,ostatok;
        n= 285;
        ten=10;
        hundred = ten*10;
        first = n/hundred;
        ostatok = n%hundred;

        System.out.println("n = " + n);
        System.out.println("Сумма = " + (first+ostatok/ten+ostatok%ten));
    }
}
