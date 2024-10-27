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
public class B extends A {
    private int a = 123;
    public B() {
        a = 2222;
    }
    public void rollBackA () {
        a = super.getA();
    }
    public void setA( int value) {
        a = value;
    }
    public int getA() {
        return a;
    }
} //class B
