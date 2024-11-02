
/**
 *
 * @author Kiem Ho
 */
public class Circle extends Shape{
     private double radius;

    public Circle(double radius) {   
        this.radius = radius;  
        if(radius <=0 ){
            this.radius = 0.5;
        }              
    }    
   
    public void calculateArea() {        
        super.setArea(Math.PI*radius*radius);        
    }  
       
    public void calculatePerimeter() {
        super.setPerimeter(2*Math.PI*radius);       
    }    
            
    @Override
    public String toString() {
        calculateArea();
        calculatePerimeter();
        return String.format("%.2f,%.2f\n",super.getPerimeter(),getArea());
    }
    
}
