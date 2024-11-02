/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phong
 */
public class SpecCar extends Car {
    private int warranty;
    
    public SpecCar() {}
    public SpecCar(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }
    
    @Override
    public String toString() {
        return String.format("%s,%d", super.toString(), warranty);
    }

    public int getWarranty() {
        return (getName().equals("AUDI")?(warranty+5):(warranty+2));
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
    
}
