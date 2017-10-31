import hw06.ArrayList;
import hw06.Item;
import hw06.LinkedList;
import hw06.List;

public class Utils {

    public static void main(String[] args) {
        /*
        List list = new LinkedList();
        list.add(new Item("1a"));
        list.add(new Item(2));
        list.add(new Item(33));
        list.add(new Item("u"));
        list.add(new Item(44));
        list.add(new Item("5"));

        System.out.println("list - " + list.toMyString());

        Object o = Utils.find(new Predicate() {
            @Override
            public boolean apply(Object o) {
                return "2".equals(o.toString());
            }
        }, list);

        System.out.println("Utils find - " + o);


       List findList = Utils.filter(new Predicate() {
            @Override
            public boolean apply(Object o) {
                return o.toString().length() == 1;
            }
        }, list);

        System.out.println("Utils filter - " + findList.toMyString());

        List transList = Utils.transform(new Transformer() {
            @Override
            public Object apply(Object o) {
                return new Item (o.toString() + o.toString());
            }
        }, list);

        System.out.println("Utils transrorm - " + transList.toMyString());
        */
Object[] arr = new Object[4];
arr[0] = new Item(4);
        arr[1] = new Item("da");
        arr[2] = new Item(5);
        arr[3] = new Item("%");

        List arrList = Utils.toList(arr);

        System.out.println("arrList = " + arrList.toMyString());

    }

    public static Object find(Predicate pred, List list) {
        for (Object o : list){
            if (pred.apply(o)) return o;
        }
        return null;
    }

    public static List filter (Predicate pred, List list) {
        List resList = new LinkedList();
        for (Object o : list){
            if (pred.apply(o)) {
                resList.add((Item) o);
            }
        }
        return resList;
    }

    public static List transform (Transformer trans, List list) {
        List resList = new LinkedList();
        for (Object o : list){
            resList.add((Item) trans.apply(o)) ;
        }
        return resList;
    }

    public static List toList (Object[] arr) {
        List resultList = new ArrayList();
        for( Object o: arr){
            resultList.add(new Item(o));
        }
       return  resultList;
    }

    public static List intersect(List list1, List list2, Predicate2 pred) {
        List resultList = new LinkedList();
        return resultList;
    }

    public static List differencet(List list1, List list2, Predicate2 pred) {
        List resultList = new LinkedList();
        return resultList;
    }
}
