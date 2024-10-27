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
public class TestCircle {

    public static void main(String[] args) {
        // TODO code application logic here
        Circle cir1 = new Circle(10);
        Circle cir2 = new Circle(12);
        System.out.println("c1 Area is " + cir1.getArea());
        System.out.println("c2 Diameter is " + cir2.getDiameter());
        cir1.radius = 15;
        System.out.println("c1 Area is " + cir1.getArea());
    }
}
