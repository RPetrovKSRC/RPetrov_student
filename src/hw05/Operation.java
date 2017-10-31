package hw05;

public abstract class Operation {
    protected int a;
    protected int b;
/*
    public Operation (int a, int b) {
        this.a = a;
        this.b = b;
    }
    */

    public abstract int doOperation (int a, int b);
}
