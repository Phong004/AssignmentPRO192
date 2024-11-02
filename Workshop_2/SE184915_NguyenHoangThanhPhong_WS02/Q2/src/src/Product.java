
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private int discount;
    
    public Product() {}
    
    public Product(int id, String name, double price, int quantity, int discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }
    
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    public double subTotal() {
        double subtotal = this.quantity * this.price * (100-this.discount)/100;
        return subtotal;
    }
}
