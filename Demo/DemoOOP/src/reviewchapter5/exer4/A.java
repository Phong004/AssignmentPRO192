/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewchapter5.exer4;

/**
 *
 * @author nguye
 */
public class A {
    int a = 100;
    public A() {
        //System.out.println("in the constructor of class A: ");
        //System.out.println("a = "+a);
        a = 333;
        //System.out.println("a = "+a);
    }
    public void setA( int value) {
        a = value;
    }
    public int getA() {
        return a;
    }
} //class A
