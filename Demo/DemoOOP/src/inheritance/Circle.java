package inheritance;

public class Circle {
    double radius;
    //Contructor
    Circle(double radius) {
        this.radius = radius;
    }
    //Methods
    double getRadius() {
        return radius;
    }
    double getArea() {
        //tich phan de tinh dien tich hinh tron
        return Math.PI * (this.radius * this.radius);
    }
    double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
    double getDiameter() {
        return 2 * this.radius;
    }

    @Override
    public String toString() {
        return "radius=" + radius ;
    }
}
