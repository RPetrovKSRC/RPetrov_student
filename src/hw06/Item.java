package hw06;

public class Item {
   public Object value;

    public Item(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
