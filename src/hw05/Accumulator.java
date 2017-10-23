package hw05;

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
}
