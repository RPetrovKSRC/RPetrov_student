import java.util.ArrayList;
import java.util.Collections;

public class IntList {
    Item head;

    public IntList() {
        head = new Item();
    }

    public IntList(int i) {
        IntList list = new IntList();
        list.add(4);
        list.add(1);
        list.add(25);
        list.add(10);
        list.add(15);
        list.add(3);
        System.out.println(list.toMyString());
        System.out.println("Element at index 2 : " + list.get(2));
        list.sort();
        System.out.println("Sorted : " + list.toMyString());
        list.remove(3);
        System.out.println("Delete 3 : " + list.toMyString());
    }

    public void add(int i) {
        Item newItem = new Item();
        newItem.value = i;

        if (head.next == null) {
            head.next = newItem;
        } else {
            getLastItem().next = newItem;
        }
    }

    public Item getLastItem() {
        Item item = head.next;

        while (item.next != null) {
            item = item.next;
        }
        return item;
    }

    public void sort() {
        Item item;
        Item preprevitem;
        Item previtem;
        Item nextitem;

        for (int j = 0; j < 10; j++) {
            item = head.next;
            preprevitem = head;

            while (item.next != null) {
                previtem = item;
                nextitem = item.next;
                if (previtem.value > nextitem.value) {
                    preprevitem.next = nextitem;
                    previtem.next = nextitem.next;
                    nextitem.next = previtem;
                    item = previtem;
                    preprevitem = nextitem;
                } else {
                    preprevitem = item;
                    item = nextitem;
                }
            }
        }
    }

    public int get(int index) {
        int i = 0;
        Item item = head.next;

        while (item.next != null) {
            if (i == index) {
                return item.value;
            }
            item = item.next;
            i++;
        }
        return -1;
    }

    public void remove(int index) {
        int i = 0;
        Item previtem;
        Item item;
        Item nextitem;

        item = head.next;
        previtem = item;

        while (item.next != null) {
            nextitem = item.next;

            if (i == index) {
                if (i == 0) {
                    head.next = nextitem;
                    return;
                } else {
                    previtem.next = nextitem;
                    return;
                }
            }
            i++;
            previtem = item;
            item = nextitem;
        }
    }

    public String toMyString() {
        StringBuilder sb = new StringBuilder();
        Item item = head.next;

        while (item.next != null) {
            sb.append(item.value + " ");
            item = item.next;
        }
        sb.append(item.value + " ");
        return sb.toString();
    }

    private class Item {
        int value;
        Item next;
    }
}