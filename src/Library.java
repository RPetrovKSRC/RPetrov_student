public class Library {
    final int CAPACITY = 50;
    int bookCounter;

    public  Library() {
        //
    }

    public void put (Book book, int quantity) {

        if ( CAPACITY < bookCounter + quantity) {
            System.out.println("Library is full");
            return;
        }

        bookCounter += quantity;
    }

    public int get (Book book, int quantity) {

        bookCounter -= quantity;
        return bookCounter;
    }

    private class Book {
        String author;
        String title;
        int pagesNum;
    }
}
