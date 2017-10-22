public class Library {
    protected final int shelfQuantity = 3;
    private BookShelf[] shelfArray = new BookShelf[shelfQuantity];

    public Library() {

    }
/*
    public static void main(String[] args) {
        Library mylib = new Library();
        Book book1 = new Book("Агата Кристи", "9 негритят", 350);
        Book book2 = new Book("Джоан Роулинг", "Гарри Поттер", 850);
        Book book3 = new Book("Лев Толстой", "Война и мир", 2500);
        Book book4 = new Book("Братья Стругацкие", "Пикник на обочине", 430);

    }*/

    private BookShelf getShelfByBook(Book book) {
        BookShelf shelf;
        for (int i = 0; i < shelfQuantity; i++) {
            if (shelfArray[i] != null) {
                shelf = shelfArray[i];
                if (shelf != null) {
                    if (shelf.book.author.equals(book.author) & shelf.book.title.equals(book.title)) return shelf;
                }
            }
        }
        return null;
    }

    private BookShelf getEmptyShelf() {
        BookShelf shelf;
        for (int i = 0; i < shelfQuantity; i++) {
            shelf = shelfArray[i];
            if (shelf == null) {
                shelfArray[i] = new BookShelf();
                return shelfArray[i];
            }
            if (shelf.book == null) return shelf;
        }
        System.out.println("Библиотека переполнена");
        return null;
    }

    public void put(Book book, int quantity) {
        BookShelf shelf = getShelfByBook(book);
        if (shelf == null) {
            shelf = getEmptyShelf();
            if (shelf != null) {
                shelf.book = book;
                shelf.quantity = quantity;

            }
        } else {
            shelf.quantity += quantity;

        }
        System.out.println( "OK");
    }

    public int get(Book book, int quantity) {
        BookShelf shelf = getShelfByBook(book);

        if (shelf == null) {
            System.out.println("Книга не найдена в библиотеке");
        } else {
            if (quantity == shelf.quantity | quantity > shelf.quantity) {
                shelf.book = null;
                shelf.quantity = 0;
                return 0;
            } else {
                shelf.quantity -= quantity;
                return shelf.quantity;
            }
        }
        return 0;
    }

    private class BookShelf {
        Book book;
        int quantity;
    }
}
