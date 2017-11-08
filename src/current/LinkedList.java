package current;

import interfaces.Item;
import interfaces.List;
import interfaces.Queue;
import interfaces.Stack;

import java.util.Iterator;

public class LinkedList implements List, Stack, Queue {
    Node head;
    int elements = 0;

    public LinkedList() {
        head = new Node();
    }

    @Override
    public int hashCode() {
        int i = 11;
        int result = 12;
        for(Object o: this){
            result = result + (13 + o.hashCode()) * i;
            i++;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        LinkedList otherList = (LinkedList) o;
        if ( !(o instanceof LinkedList)) {
            return false;
        }

        if (!this.getClass().getName().equals(o.getClass().getName())) {
            return false;
        }

        if (this.size() != otherList.size()) {
            return false;
        }
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i) != otherList.get(i) && !this.get(i).toString().equals(otherList.get(i).toString())) {
                return false;
            }
        }
        return true;
    }

    // interfaces.List
    @Override
    public void add(Object object) {
        Node newNode = new Node();
        newNode.value = object;

        if (head.next == null) {
            head.next = newNode;
        } else {
            getLastNode().next = newNode;
        }
        elements++;
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

    public Object get(int index) {
        int i = 0;
        Node node = head.next;

        while (node.next != null | node.value != null) {
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
        elements--;
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

    // interfaces.Stack LIFO
    @Override
    public void push(Object object) {
        Node firstNode = new Node();
        firstNode.value = object;

        if (head.next == null) {
            head.next = firstNode;
        } else {
            Node secondNode = head.next;
            head.next = firstNode;
            firstNode.next = secondNode;
        }
        elements++;
    }

    @Override
    public Object pop() {
        Node firstNode = head.next;
        head.next = firstNode.next;
        return firstNode.value;
    }

    //interfaces.Queue FIFO
    //public void add(Item item) {} defined in interfaces.List

    @Override
    public Object poll() {
        Node firstNode = head.next;
        head.next = firstNode.next;
        elements--;
        return firstNode.value;
    }

    @Override
    public Iterator iterator() {
        return new LLIterator(head);
    }

    private static class LLIterator implements Iterator {
        Node next;

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