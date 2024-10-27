package nestedclass;

interface Eatable {

    void eat();

    void drink();
}

class TestAnnonymousInner1 {

    public static void main(String args[]) {
        Eatable e = new Eatable() {
            public void eat() {
                System.out.println("nice fruits");
            }

            public void drink() {
                System.out.println("fruits");
            }
        };
        e.eat();
    }

}
