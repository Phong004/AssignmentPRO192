class StaticTest {
    static int a;
    private int b;
    public StaticTest() {
        a = 0;
        b = 0;
    }
    public StaticTest(int a) {
        this.a = a;
    }
    
    public static int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public static void setA(int newA) {
        a = newA;
    }
    public void setB(int newB) {
        b = newB;
    }
}
