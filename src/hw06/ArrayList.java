package hw06;

public class ArrayList implements List, Stack, Queue {
    Item[] array = new Item[3];

    //List
    @Override
    public void add(Item item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = item;
                break;
            }
        }
    }

    @Override
    public String toMyString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                sb.append(array[i].value + " ");
            }
        }
        return sb.toString();
    }

    public Item get(int index) {
        Item item = null;
        for (int i = 0; i < array.length; i++) {
            if (i == index-1) {
                item = array[i];
            }
        }
        return item;
    }

    public void remove(int index) {

    }

    public int size() {
        return 0;
    }

    // Stack LIFO
    @Override
    public void push(Item item) {

    }

    @Override
    public Item pop() {
        return null;
    }

    //Queue FIFO

    @Override
    public Item poll() {
        return null;
    }
}
