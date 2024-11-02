
public class SSD extends Product {

    private String code;
    private int speedread;
    private int capacity;
    private int price;

    public SSD(String code, int speedread, int capacity, int price, String name, String brand) {
        super(name, brand);
        this.code = code;
        this.speedread = speedread;
        this.capacity = capacity;
        this.price = price;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public double inforSale() {
        // TO DO YOUR CODE HERE
        if (speedread <= 1024) {
            return (double) price - (double) price * 20.0 / 100.0;
        } else if (speedread <= 2048) {
            return (double) price - (double) price * 10.0 / 100.0;
        } else {
            return (double) price - (double) price * 5.0 / 100.0;
        }
    }

    @Override
    public double totalAmount(int quantity) {
        // TO DO YOUR CODE HERE
        return (double) quantity * inforSale();
    }

    @Override
    public String toString() {
        // TO DO YOUR CODE HERE
        return "" + code + "-" + super.getName() + "-" + super.getBrand() + "-"
                + String.format("%dGB-%dBytes-%d$", capacity, speedread, price);
    }

}
