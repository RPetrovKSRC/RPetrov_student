public class HW_02_02 {
    public static void main(String[] args){
        int m,n,ten,res1,res2;
        m = 17;
        n = 5;
        ten = 10;

        if (ten > n)
            res1 = ten-n;
        else
            res1 = n-ten;

        res2 = ten > m ? ten-m : m-ten;

        if (res1 > res2)
            System.out.println("m = " + m + " ближе к 10 чем n = " + n);
        else
            System.out.println("n = " + n + " ближе к 10 чем m = " + m);
    }
}