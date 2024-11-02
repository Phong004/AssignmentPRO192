
public class Bike {
    private int id;
    private String name;
    private double price;
    
    public Bike() {}
    
    public Bike(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return this.name.toUpperCase();
    }
    
    public double getSalePrice() {
        double incPrice = this.price * 10 / 100;
        return incPrice+this.price;
    }
    
    @Override
    public String toString() {
        return ""+this.id+","+getName()+","+String.format("%.2f", this.price);
    }
}
