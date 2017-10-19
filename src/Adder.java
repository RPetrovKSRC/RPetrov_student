public class Adder {
    int x;
    int iterator;

    public Adder(int i) {
        iterator = i;
    }

    public void add(){
        x += iterator;
    }

    public int getValue() {
        return x;
    }
}
