class Main {

    public static void main(String[] args) {
        System.out.println("a =" + StaticTest.a);
        StaticTest s1 = new StaticTest(10);
        StaticTest s2 = new StaticTest();

        System.out.println("s1 values:");
        System.out.println("a =" + StaticTest.getA() + ", b =" + s1.getB());
        System.out.println("s2 values:");
        System.out.println("a =" + s2.getA() + ", b =" + s2.getB());
        StaticTest.setA(5);
        s1.setB(3);
        System.out.println("\ns1 values:");
        System.out.println("a =" + s1.getA() + ", b =" + s1.getB());
        System.out.println("s2 values:");
        System.out.println("a =" + s2.getA() + ", b =" + s2.getB());
        //System.out.println("a =" + StaticTest.getA());
    }
}
