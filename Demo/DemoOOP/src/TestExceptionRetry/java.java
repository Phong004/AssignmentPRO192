/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestExceptionRetry;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        boolean retry = true;
        do {
            try {
                System.out.print("Enter n: ");
                input = sc.nextInt();
                int n = factorial(input);
                System.out.println("Ans = " + n);
                retry = false; // no need to retry
            } catch (IllegalArgumentException expObj) {
                System.out.println(expObj.getMessage());
            }
        } while (retry);
    }

    public static int factorial(int n)
            throws IllegalArgumentException {

        if (n < 0) {
            IllegalArgumentException exObj
                    = new IllegalArgumentException(n + " is invalid!");
            throw exObj;
        }

        int ans = 1;
        for (int i = 2; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

}
