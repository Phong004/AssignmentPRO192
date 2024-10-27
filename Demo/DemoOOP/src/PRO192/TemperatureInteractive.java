/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRO192;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class TemperatureInteractive {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter temperature in Fahrenheit: ");
        //fahrenheit = sc.nextDouble();
        //celsius = (5.0/9) * (fahrenheit -32);
       
        celsius = 3.5963;
        String s = "Hello";
        long l = 123;
        System.out.printf("Celsius: %.5f\n", celsius);
        System.out.printf("String: %10s\n", s);
        System.out.printf("String: %-10s\n", s);
        System.out.printf("Long: %-10d\n", l);
        System.out.printf("Long: %10d\n", l);
        System.out.printf("Long: %5d, String: %10s \n", l,s);
    }
}
