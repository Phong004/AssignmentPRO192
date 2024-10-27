package collectiondemo.generic;

public class TestNewGenericPair {

    public static void main(String[] args) {

        NewPair<String, Integer> someone =
                new NewPair<String, Integer>("James Gosling", 55);

        System.out.println("Name: " + someone.getFirst());
        System.out.println("Age: " + someone.getSecond());

        NewPair<Integer, String> someone1 =
                new NewPair<Integer, String>(55, "James Gosling");

        System.out.println("Name: " + someone1.getFirst());
        System.out.println("Age: " + someone1.getSecond());
    }
}
