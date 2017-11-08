package interfaces;

public interface Queue {
    //FIFO
    public void add(Object o);
    public Object poll();
    public String toMyString();
    public boolean equals(Object o);
    //public int hashCode(Object o);
}
