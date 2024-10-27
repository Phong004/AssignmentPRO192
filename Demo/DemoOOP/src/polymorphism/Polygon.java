/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author nguye
 */
public abstract class Polygon extends Shape{  

    public Polygon() {
    }

    public Polygon(String color, boolean filled) {
        super(color, filled);
    }    
    @Override
    public abstract double getArea();
    @Override
    public abstract double getPerimeter(); 
    @Override
    public abstract String toString();        
}
