package WS1;

public class Main {

    public static void main(String[] args) {
        // write your code here
        testClassFraction();
    }

    public static void testClassFraction() {
        Fraction frac1 = new Fraction(1, 3); // tạo phân số có tử = 1 và mẫu = 3
        Fraction frac2 = new Fraction(4, 8); // tạo phân số có tử = 4 và mẫu = 8

        // gọi các phương thức
        System.out.println(frac1.toString());
        System.out.println(frac2.toString());

        Fraction frac3 = Fraction.add(frac1, frac2);
        System.out.println("Add:" + frac3.toString());

        frac3 = Fraction.sub(frac1, frac2);
        System.out.println("Sub:" + frac3.toString());

        frac3 = Fraction.mul(frac1, frac2);
        System.out.println("Mul:" + frac3.toString());

        frac3 = Fraction.div(frac1, frac2);
        System.out.println("Div:" + frac3.toString());
    }
}
