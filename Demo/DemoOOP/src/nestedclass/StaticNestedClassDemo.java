package nestedclass;

public class StaticNestedClassDemo {
    public static void main(String[] args) {
        // Khoi tao static nested class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();
    }
}