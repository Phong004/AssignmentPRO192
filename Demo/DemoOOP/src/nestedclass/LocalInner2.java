package nestedclass;

public class LocalInner2 {
    private int data = 30; // instance variable

    void display() {
        int value = 50; // biến local phải là final từ jdk 1.7 trở về trước
        class Local {
            void msg() {
                System.out.println(value);
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        LocalInner2 obj = new LocalInner2();
        obj.display();
    }
}