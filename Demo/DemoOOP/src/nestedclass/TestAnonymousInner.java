package nestedclass;

abstract class Shape {

    abstract void print();
}

public class TestAnonymousInner {

    public static void main(String args[]) {
        Shape p = new Shape() {
            void print() {
                System.out.println("Circle");
            }
        };
        p.print();
    }
}
