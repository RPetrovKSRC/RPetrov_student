package hw06;

public interface Queue {
    //FIFO
    public void add(Item object);
    public Item poll();
    public String toMyString();
}
