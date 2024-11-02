/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phong
 */
import java.lang.Math;

public class Circle extends Shape {
    private double radius;
    
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        calculateArea();
        calculatePerimeter();
        double perimeter = super.getPerimeter();
        double area = getArea();
        return String.format("%1$.2f,%2$.2f", perimeter,area);
    }
    public void calculateArea() {
        setArea(radius*radius*Math.PI);
    }
    public void calculatePerimeter() {
        setPerimeter(2*radius*Math.PI);
    }
}
