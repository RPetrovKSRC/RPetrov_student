package current;

import interfaces.*;

public class Utils {

    public static void main(String[] args) {
        /*
        interfaces.List list = new current.LinkedList();
        list.add(new Item("1a"));
        list.add(new Item(2));
        list.add(new Item(33));
        list.add(new Item("u"));
        list.add(new Item(44));
        list.add(new Item("5"));

        System.out.println("list - " + list.toMyString());

        Object o = current.Utils.find(new interfaces.Predicate() {
            @Override
            public boolean apply(Object o) {
                return "2".equals(o.toString());
            }
        }, list);

        System.out.println("current.Utils find - " + o);


       interfaces.List findList = current.Utils.filter(new interfaces.Predicate() {
            @Override
            public boolean apply(Object o) {
                return o.toString().length() == 1;
            }
        }, list);

        System.out.println("current.Utils filter - " + findList.toMyString());

        interfaces.List transList = current.Utils.transform(new interfaces.Transformer() {
            @Override
            public Object apply(Object o) {
                return new Item (o.toString() + o.toString());
            }
        }, list);

        System.out.println("current.Utils transrorm - " + transList.toMyString());
        */
        /*
Object[] arr = new Object[4];
arr[0] = new Item(4);
        arr[1] = new Item("da");
        arr[2] = new Item(5);
        arr[3] = new Item("%");

        interfaces.List arrList = current.Utils.toList(arr);

        System.out.println("arrList = " + arrList.toMyString());
*/

        List list1 = new LinkedList();
        List list2 = new LinkedList();

        Item item = new Item("1a");
        list1.add(item);
        list2.add(item);
        item = new Item(2);
        list1.add(item);
        list2.add(item);
        item = new Item(33);
        list1.add(item);
        //list2.add(item);
        list2.add(new Item(31));

        boolean q = list1.equals(list2);
        System.out.println("Equals = " + q);

        interfaces.List intersectedList = current.Utils.intersect(new interfaces.Predicate2() {
            @Override
            public boolean apply(Object o1, Object o2) {
                if (o1 == o2) {
                    return true;
                } else {
                    return false;
                }
            }
        }, list1, list2);


        System.out.println("current.Utils intersect - " + intersectedList.toMyString());

        interfaces.List differencedList = current.Utils.difference(new interfaces.Predicate2() {
            @Override
            public boolean apply(Object o1, Object o2) {
                if (o1 == o2) {
                    return true;
                } else {
                    return false;
                }
            }
        }, list1, list2);
        System.out.println("current.Utils difference - " + differencedList.toMyString());
    }

    public static Object find(Predicate pred, List list) {
        for (Object o : list) {
            if (pred.apply(o))
                return o;
        }
        return null;
    }

    public static List filter(Predicate pred, List list) {
        List resList = new LinkedList();
        for (Object o : list) {
            if (pred.apply(o)) {
                resList.add(o);
            }
        }
        return resList;
    }

    public static List transform(Transformer trans, List list) {
        List resList = new LinkedList();
        for (Object o : list) {
            resList.add(trans.apply(o));
        }
        return resList;
    }

    public static List toList(Object[] arr) {
        List resultList = new ArrayList();
        for (Object o : arr) {
            resultList.add(o);
        }
        return resultList;
    }

    public static List intersect(Predicate2 pred, List list1, List list2) {
        List resultList = new LinkedList();
        if (pred == null) {
            for (Object o1 : list1) {
                for (Object o2 : list2) {
                    if (o1.equals(o2)) {
                        resultList.add(o1);
                        break;
                    }
                }
            }
        } else {
            for (Object o1 : list1) {
                for (Object o2 : list2) {
                    if (pred.apply(o1, o2)) {
                        resultList.add(o1);
                    }
                }
            }
        }
        return resultList;
    }

    public static List difference(Predicate2 pred, List list1, List list2) {
        List resultList = new LinkedList();
        boolean isUniqueItem;
        for (Object o1 : list1) {
            isUniqueItem = true;
            for (Object o2 : list2) {
                if (pred.apply(o1, o2)) {
                    isUniqueItem = false;
                    break;
                }
            }
            if (isUniqueItem) {
                resultList.add(o1);
            }
        }
        for (Object o2 : list2) {
            isUniqueItem = true;
            for (Object o1 : list1) {
                if (pred.apply(o1, o2)) {
                    isUniqueItem = false;
                    break;
                }
            }
            if (isUniqueItem) {
                resultList.add(o2);
            }
        }
        return resultList;
    }
}
