public class Circle {

    public double radius;
    //Contructor
    Circle(double radius) {
        this.radius = radius;
    }
    //Methods
    double getRadius() {
        return radius;
    }
    double getArea() {
        return Math.PI * (this.radius * this.radius);
    }
    
    double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
    double getDiameter() {
        return 2 * this.radius;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Circle cir1 = new Circle(10);
        Circle cir2 = new Circle(12);
        System.out.println("c1 Area is "+cir1.getArea());
        System.out.println("c2 Diameter is "+cir2.getDiameter());
        cir1.radius = 15;
        System.out.println("c1 Area is "+cir1.getArea());
    }
}
