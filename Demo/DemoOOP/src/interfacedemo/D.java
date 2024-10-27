/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo;

/**
 *
 * @author nguye
 */
public class D extends A implements I_B, I_C {

    @Override
    public void b() {
        System.out.print("Interface B.b");
    }

    @Override
    public void b(int k) {
        System.out.print("Interface B.b:" + k);
    }

    @Override
    public void c() {
        System.out.print("Interface C.c");
    }

}
