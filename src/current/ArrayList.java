package current;

import interfaces.Item;
import interfaces.List;
import interfaces.Queue;
import interfaces.Stack;

import java.util.Iterator;

public class ArrayList implements List, Stack, Queue {
    Item[] array = new Item[10];

    @Override
    public Iterator iterator() {
        return new ALIterator();
    }

    private class ALIterator implements Iterator {
        int index = 0;

        private ALIterator() { }

        @Override
        public boolean hasNext() {
            if (array[index] != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            Item item = array[index];
            index++;
            return item;
        }
    }

    //interfaces.List
    @Override
    public void add(Item object) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = object;
                break;
            }
        }
    }

    @Override
    public String toMyString() {
        StringBuilder sb = new StringBuilder();
        for (Item anArray : array) {
            if (anArray != null) {
                sb.append(anArray.value + " ");
            }
        }
        return sb.toString();
    }

    public Item get(int index) {
        Item object = null;
        for (int i = 0; i < array.length; i++) {
            if (i == index-1) {
                object = array[i];
            }
        }
        return object;
    }

    public void remove(int index) {
        for (int i = index; i < array.length; i++) {
            if (array[i+1] != null) {
                array[i] = array[i+1];
            } else {
                array[i] = null;
                break;
            }
        }

    }

    public int size() {
        return 0;
    }

    // interfaces.Stack LIFO
    @Override
    public void push(Item object) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = object;
                break;
            }
        }
    }

    @Override
    public Item pop() {
        Item object = null;
        for (int i = array.length; i >= 0; i--) {
            if (array[i] != null) {
                object = array[i];
                array[i] = null;
               break;
            }
        }
        return object;
    }
    //interfaces.Queue FIFO

    @Override
    public Item poll() {
        Item object = null;
        if (array[0] != null) {
            object = array[0];
        }
        for (int i = 0; i < array.length; i++) {

                if (array[i+1] != null) {
                    array[i] = array[i+1];
                } else {
                    array[i] = null;
                    break;
                }
            }
        return object;
    }
}
