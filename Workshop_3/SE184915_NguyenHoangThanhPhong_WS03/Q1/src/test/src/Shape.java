
/**
 *
 * @author Kiem Ho
 */
public class Shape {
    private double perimeter;
    private double area; 

    public Shape() {
        this.perimeter = 0;
        this.area = 0;
    }   
    
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public double getPerimeter() {
        return perimeter;
    }   
    public double getArea() {
        return area;
    }    
}
