package hw06;

import java.util.Iterator;

public class LinkedList implements List, Stack, Queue {
    Node head;
    int elements = 0;

    public LinkedList() { head = new Node();}

    //@Override
    public boolean equals(LinkedList otherList) {
        if(this.elements != otherList.elements) return false;

        for (int i = 0; i < this.elements ; i++) {
            if (this.get(i).value != otherList.get(i).value & !this.get(i).value.toString().equals(otherList.get(i).value.toString())) return false;
        }
        return true;
    }

    // List
    @Override
    public void add(Item object) {
        Node newNode = new Node();
        newNode.value = object;

        if (head.next == null) {
            head.next = newNode;
        } else {
            getLastNode().next = newNode;
        }
    }

    public Node getLastNode() {
        Node node = head.next;

        while (node.next != null) {
            node = node.next;
        }
        return node;
    }

    public int size() {
        return elements;
    }

/*    public void sort() {
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
    }*/

    public Item get(int index) {
        int i = 0;
        Node node = head.next;

        while (node.next != null) {
            if (i == index) {
                return node.value;
            }
            node = node.next;
            i++;
        }
        return null;
    }

    public void remove(int index) {
        int i = 0;
        Node prevnode;
        Node node;
        Node nextnode;

        node = head.next;
        prevnode = node;

        while (node.next != null) {
            nextnode = node.next;

            if (i == index) {
                if (i == 0) {
                    head.next = nextnode;
                    return;
                } else {
                    prevnode.next = nextnode;
                    return;
                }
            }
            i++;
            prevnode = node;
            node = nextnode;
        }
    }

    @Override
    public String toMyString() {
        StringBuilder sb = new StringBuilder();
        Node node = head.next;

        while (node.next != null) {
            sb.append(node.value + " ");
            node = node.next;
        }
        sb.append(node.value + " ");
        return sb.toString();
    }

    // Stack LIFO
    @Override
    public void push(Item object) {
        Node firstNode = new Node();
        firstNode.value = object;

        if (head.next == null) {
            head.next = firstNode;
        } else {
            Node secondNode = head.next;
            head.next = firstNode;
            firstNode.next = secondNode;
        }
    }

    @Override
    public Item pop() {
        Node firstNode = head.next;
        head.next = firstNode.next;
        return firstNode.value;
    }

    //Queue FIFO
    //public void add(Item item) {} defined in List

    @Override
    public Item poll() {
        Node firstNode = head.next;
        head.next = firstNode.next;
        return firstNode.value;
    }

    @Override
    public Iterator iterator() {
        return new LLIterator(head);
    }

    private static class LLIterator implements Iterator {
       private Node next;

       private LLIterator(Node nextNode) {
        this.next = nextNode;
       }

        @Override
        public boolean hasNext() {
            if (next.next != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            next = next.next;
            return next.value;
        }
    }
}