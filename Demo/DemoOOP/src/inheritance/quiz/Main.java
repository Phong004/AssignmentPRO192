/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.quiz;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String avg[]){
        A a = new D();
        ((D)a).p();
        
        Object obj = new D();
        ((D)obj).p();
    }
}
