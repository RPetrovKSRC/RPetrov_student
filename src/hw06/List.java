package hw06;

public interface List {
    public void add(Item item);
    public Item get(int index);
    public void remove(int index);
    public int size();
    public String toMyString();
}
