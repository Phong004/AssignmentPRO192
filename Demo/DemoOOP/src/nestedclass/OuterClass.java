package nestedclass;

public class OuterClass {
    // static member
    static int outer_x = 10;
    // instance(non-static) member
    int outer_y = 20;
    // private member
    private static int outer_private = 30;
    // static nested class
    static class StaticNestedClass {
        void display() {
            // Truy cap thanh vien static cua outer class
            System.out.println("outer_x = " + outer_x);
            // Truy cap thanh vien private cua outer class
            System.out.println("outer_private = " + outer_private);
        }
    }
    public static void main(String[] args) {
        // Khoi tao static nested class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();
    }
}
