public class HW_04 {
    public static void main(String[] args) {
/*
        Adder adder = new Adder(6);
        System.out.println("Adder value - " + adder.x);
        adder.add();
        System.out.println("Adder value - " + adder.x);
        adder.add();
        System.out.println("Adder value - " + adder.x);
*//*
        IntList list = new IntList();
        list.add(0);
        list.add(1);
        list.add(25);
        list.add(10);
        list.add(15);
        list.add(3);
        System.out.println(list.toMyString());
        System.out.println("Element at index 2 = " + list.get(2));
        list.sort1();
        System.out.println(list.toMyString());
        list.remove(3);
        System.out.println(list.toMyString());
*/
       // new IntList(1);
        Book book1 = new Book("Агата Кристи", "9 негритят", 350);
        Book book2 = new Book("Джоан Роулинг", "Гарри Поттер", 850);
        Book book3 = new Book("Лев Толстой", "Война и мир", 2500);
        Book book4 = new Book("Братья Стругацкие", "Пикник на обочине", 430);

        Library mylib = new Library();
        System.out.print("Положить Агату Кристи - ");
        mylib.put(book1, 25);
        System.out.print("Положить Джоан Роулинг - ");
        mylib.put(book2, 70);
        System.out.print("Взять Льва Толстого - ");
        System.out.print(mylib.get(book3, 3) + "\n");
        System.out.println("Положить Льва Толстого");
        mylib.put(book3, 100);
        System.out.println("Положить Стругацких");
        mylib.put(book4, 5);
        System.out.println("Взять Льва Толстого");
        System.out.println(mylib.get(book3, 3));
        //mylib.get(book3, 25);

    }}
