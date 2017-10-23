package hw05;

public class Power extends Operation {
    @Override
    public int doOperation(int a, int b) {
        int result = a;
        for (int i = 0; i < b; i++) {
            result *= b;
        }
        return result;
    }
}