package shop;

public class Product {
    int id;
    String title;
    String description;
    int qty;
    double price;

    public Product(int id, String title, String description, int qty, double price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.qty = qty;
        this.price = price;
    }
    
    @Override
    public String toString(){
        return id + " - " + title + " (" + description + ")";
    }
    
}
