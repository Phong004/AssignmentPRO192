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
public class InputOutputDemo {

    public static void main(String[] args) {
        int a[];    //array of interger
        int n;      //number of array
        int i;      //variable for traversing of array
        Scanner sc = new Scanner(System.in);// object the keyboard
        System.out.print("Enter the number of elements: ");
        n = Integer.parseInt(sc.nextLine());// n= sc.nextInt();
        a = new int[n];// mem. allocating for the elements of the array
        for (i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " of " + n + " element: ");
            a[i] = sc.nextInt();
        }
        System.out.print("Entered values: ");
        for (i = 0; i < n; i++) {
            System.out.format("%5d", a[i]);
        }
        int s = 0;
        for (int x : a) {
            s += x;
        }
        System.out.println("\nSum of values: " + s);
    }

    public static boolean checkInt(String interger) {
        return false;
    }
}
