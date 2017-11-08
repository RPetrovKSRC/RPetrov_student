package current;

import interfaces.Item;
import interfaces.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("current.LinkedList > interfaces.List");
        //List list = (List) new current.LinkedList();
        List list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add("3");
        list.add(4);

        //System.out.println(list.toMyString());

        for(Object o: list) {
            System.out.print( o  + " ");
        }
        System.out.println("HashCode = " + list.hashCode());

        List list1 = new LinkedList();
        list1.add(1);
        list1.add("2");
        list1.add(3);
        list1.add(4);
        System.out.println("HashCode = " + list1.hashCode());

/*
        System.out.println("current.LinkedList > interfaces.Stack");
        interfaces.Stack stack = new current.LinkedList();
        stack.push(new Item(1));
        stack.push(new Item(2));
        stack.push(new Item(3));
        System.out.println(stack.toMyString());
        stack.pop();
        System.out.println(stack.toMyString());

        System.out.println("current.LinkedList > interfaces.Queue");
        interfaces.Queue queue = new current.LinkedList();
        queue.add(new Item(1));
        queue.add(new Item(2));
        queue.add(new Item(3));
        System.out.println(queue.toMyString());
        queue.poll();
        System.out.println(queue.toMyString());
      */

        System.out.println("current.ArrayList > interfaces.List");
        List alist = new ArrayList();
        alist.add(new Item(10));
        alist.add(new Item(20));
        alist.add(new Item(30));
        alist.add(new Item(40));
        alist.add(new Item(50));
        alist.add(new Item(60));
        for(Object o: alist) {
            System.out.print( o  + " ");
        }


/*
        System.out.println("current.ArrayList > interfaces.List");
        interfaces.List alist = new current.ArrayList();
        alist.add(new Item(10));
        alist.add(new Item(20));
        alist.add(new Item(30));
        alist.add(new Item(40));
        alist.add(new Item(50));
        alist.add(new Item(60));
        System.out.println(alist.toMyString());
        System.out.println(alist.get(1).value);
        alist.remove(2);
        System.out.println(alist.toMyString());
        alist.remove(3);
        System.out.println(alist.toMyString());

        System.out.println("current.ArrayList > interfaces.Stack");
        interfaces.Stack astack = new current.LinkedList();
        astack.push(new Item(10));
        astack.push(new Item(20));
        astack.push(new Item(30));
        astack.push(new Item(40));
        astack.push(new Item(50));
        astack.push(new Item(60));
        System.out.println(astack.toMyString());
        astack.pop();
        System.out.println(astack.toMyString());
        astack.pop();
        System.out.println(astack.toMyString());

        System.out.println("current.ArrayList > interfaces.Queue");
        interfaces.Queue aqueue = new current.LinkedList();
        aqueue.add(new Item(10));
        aqueue.add(new Item(20));
        aqueue.add(new Item(30));
        aqueue.add(new Item(40));
        aqueue.add(new Item(50));
        aqueue.add(new Item(60));
        System.out.println(aqueue.toMyString());
        aqueue.poll();
        System.out.println(aqueue.toMyString());
        aqueue.poll();
        System.out.println(aqueue.toMyString());
*/
        /*
        current.LinkedList list = new current.LinkedList();
        list.add(4);
        list.add(1);
        list.add(25);
        list.add(10);
        list.add(15);
        list.add(3);
        System.out.println(list.toMyString());
        System.out.println("Element at index 2 : " + list.get(2));
//        list.sort();
//        System.out.println("Sorted : " + list.toMyString());
//        list.remove(3);
//        System.out.println("Delete 3 : " + list.toMyString());
*/
    }
}
