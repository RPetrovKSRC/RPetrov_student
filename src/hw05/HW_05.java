package hw05;

public class HW_05 {
    public static void main(String[] args) {
        //hw05.Accumulator
/*
        hw05.Accumulator acc = new hw05.Accumulator(2, new hw05.Multiply());
        System.out.println("Multiply 2");
        acc.accumulate(2);
        System.out.println( acc.getValue());
        acc.accumulate(2);
        System.out.println( acc.getValue());
        System.out.println("Plus 3");
        acc = new hw05.Accumulator(acc.getValue(), new hw05.Plus());
        acc.accumulate(3);
        System.out.println( acc.getValue());
        acc.accumulate(3);
        System.out.println( acc.getValue());
        System.out.println("Divide 5");
        acc = new hw05.Accumulator(acc.getValue(), new hw05.Divide());
        acc.accumulate(5);
        System.out.println( acc.getValue());
        acc.accumulate(5);
        System.out.println( acc.getValue());
*/

        Accumulator.LazyAccumulator lazyAcc = new Accumulator.LazyAccumulator();
        lazyAcc.add(1, new Operation() {
            @Override
            //Plus
            public int doOperation(int a, int b) {
                return a + b;
            }
        });

        lazyAcc.add(5, new Operation() {
            @Override
            //Multiply
            public int doOperation(int a, int b) {
                return a * b;
            }
        });

        lazyAcc.add(1, new Operation() {
            @Override
            //Minus
            public int doOperation(int a, int b) {
                return a-b;
            }
        });

        lazyAcc.calculate();


        //Shapes
//        Rectangle rec = new Rectangle();
//        rec.h = 4;
//        rec.w = 7;
//        rec.getPerimetrLength();
//        rec.getSquare();


    }
}
