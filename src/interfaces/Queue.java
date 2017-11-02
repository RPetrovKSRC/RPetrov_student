package interfaces;

public interface Queue {
    //FIFO
    public void add(Item object);
    public Item poll();
    public String toMyString();
    public boolean equals(Object o);
    //public int hashCode(Object o);
}
