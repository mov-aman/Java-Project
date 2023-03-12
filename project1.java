class Book {
    private String title;
    private String author;
    private double price;
    private int quantity;
    
    public Book(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }
    
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: $" + price + ", Quantity: " + quantity;
    }
}