package hw06;

public class Main {
    public static void main(String[] args) {
        System.out.println("LinkedList > List");
        List list = new LinkedList();
        list.add(new Item(1));
        list.add(new Item(2));
        list.add(new Item(3));
        System.out.println(list.toMyString());
        System.out.println(list.get(1).value);

        System.out.println("LinkedList > Stack");
        Stack stack = new LinkedList();
        stack.push(new Item(1));
        stack.push(new Item(2));
        stack.push(new Item(3));
        System.out.println(stack.toMyString());
        stack.pop();
        System.out.println(stack.toMyString());

        System.out.println("LinkedList > Queue");
        Queue queue = new LinkedList();
        queue.add(new Item(1));
        queue.add(new Item(2));
        queue.add(new Item(3));
        System.out.println(queue.toMyString());
        queue.poll();
        System.out.println(queue.toMyString());

        System.out.println("ArrayList > List");
        List alist = new ArrayList();
        alist.add(new Item(10));
        alist.add(new Item(20));
        alist.add(new Item(30));
        System.out.println(alist.toMyString());
        System.out.println(alist.get(1).value);

        System.out.println("ArrayList > Stack");
        Stack astack = new LinkedList();
        astack.push(new Item(10));
        astack.push(new Item(20));
        astack.push(new Item(30));
        System.out.println(astack.toMyString());
        astack.pop();
        System.out.println(astack.toMyString());

        System.out.println("ArrayList > Queue");
        Queue aqueue = new LinkedList();
        aqueue.add(new Item(10));
        aqueue.add(new Item(20));
        aqueue.add(new Item(30));
        System.out.println(aqueue.toMyString());
        aqueue.poll();
        System.out.println(aqueue.toMyString());

        /*
        LinkedList list = new LinkedList();
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
