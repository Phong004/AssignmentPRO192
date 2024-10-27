package reviewchapter5.exer4;

public abstract class Shape {

    public abstract double area();

    @Override
    public String toString() {

        return "The area is : " + area();

    }

}
