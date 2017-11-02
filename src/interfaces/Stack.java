package interfaces;

public interface Stack {
    // LIFO
    public void push(Item object);
    public Item pop ();
    public String toMyString();
    public boolean equals(Object o);
    //public int hashCode(Object o);
}
