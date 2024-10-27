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
public class UseOps_2 {

    public static void main(String[] args) {
        int[] a = {4, 4};
        int b = 1;
        a[b] = b = 0;
        System.out.println("a: " + a[0] + "," + a[1]);
    }
}
