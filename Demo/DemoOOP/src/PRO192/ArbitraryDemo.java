/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRO192;

/**
 *
 * @author nguye
 */
public class ArbitraryDemo {

    public double sum(double... group) {
        double s = 0;
        for (double x : group) {
            s += x;
        }
        return s;
    }

    public double sum1(double[] group) {
        double s = 0;
        for (double x : group) {
            s += x;
        }
        return s;
    }

    public static void main(String avg[]) {
        ArbitraryDemo arbi = new ArbitraryDemo();
        double total = arbi.sum(5.4, 3.2, 9.08, 4);
        System.out.println(total);
        
        double[] a = {5.4, 3.2, 9.08, 4};
        total = arbi.sum1(a);
        System.out.println(total);
    }
}
