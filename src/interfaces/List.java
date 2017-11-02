package interfaces;

public interface List extends Iterable{
    public void add(interfaces.Item object);
    public interfaces.Item get(int index);
    public void remove(int index);
    public int size();
    public String toMyString();
    public boolean equals(Object o);
    //public int hashCode(Object o);
}
