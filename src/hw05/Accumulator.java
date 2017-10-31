package hw05;

import hw06.Item;
import hw06.LinkedList;
import hw06.List;

public class Accumulator {
    private int value;
    private Operation oper;

    public Accumulator(int value, Operation oper) {
        this.value = value;
        this.oper = oper;
    }

    public int getValue() {
        return this.value;
    }

    public void accumulate(int i) {
        this.value = this.oper.doOperation(this.value, i);
    }

    private static class DivideOn2 {
        int res;
        DivideOn2 (int value) {
            res = value/2;
        }
    }

    public static class LazyAccumulator {
        List operationContainer;
        //int result = 0;

        public LazyAccumulator() {
            operationContainer = new LinkedList();
        }

        public void add(int a, Operation oper){
            Accumulator acc = new Accumulator(a, oper);
            operationContainer.add(new Item(acc));
        }

        public void calculate() {
            Accumulator result = new Accumulator(0, null);
            for( Object operation : operationContainer) {
                Item item = (Item) operation;
                   Accumulator acc = (Accumulator) item.value;
                if (acc != null) {
                    result = new Accumulator(result.getValue(), acc.oper);
                    result.accumulate(acc.value);
                }
            }
            System.out.println("LazyAcc = " + result.getValue());
        }
    }
}
