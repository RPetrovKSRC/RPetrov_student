package hw06;

public class Item {
   int value;

    public Item(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
