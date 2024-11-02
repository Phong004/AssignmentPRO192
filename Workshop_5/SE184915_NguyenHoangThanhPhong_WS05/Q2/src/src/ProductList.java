
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class ProductList extends ArrayList<Product> {

    public void displayAll() {
        //TODO: display all products
        for (Product pro : this) {
            System.out.println(pro.toString());
        }
    }

    public void displayDiscountInfor(String code) {
        //TODO: print the the product's final price depends on the given code parameter
        for (Product pro : this) {
            if (pro.getCode().equals(code)) {
                System.out.println(pro.inforSale());
                return;
            }
        }
    }

    public double getTotalAmountInfor(String code, int quantity) {
        //TODO: return the the product's total amount depends on the given code, quantity parameters
        double totalAmount = 0;
        for (Product pro : this) {
            if (pro.getCode().equals(code)) {
                totalAmount = pro.totalAmount(quantity);
                break;
            }
        }
        return totalAmount;
    }
}
