package hw06;

public interface Queue {
    //FIFO
    public void add(Item item);
    public Item poll();
    public String toMyString();
}
