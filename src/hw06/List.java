package hw06;

public interface List extends Iterable{
    public void add(Item object);
    public Item get(int index);
    public void remove(int index);
    public int size();
    public String toMyString();
}
