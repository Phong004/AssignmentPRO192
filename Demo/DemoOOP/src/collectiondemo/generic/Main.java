package collectiondemo.generic;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Pair<Integer> twoInt = new Pair<Integer>(-5, 20);
        Pair<String> twoStr = new Pair<String>("Turing", "Alan");

        // You can have pair of any reference data types!
        // Print out the integer pair
        System.out.println("Integer pair: (" + twoInt.getFirst() + ", " + twoInt.getSecond() + ")");

        // Print out the String pair
        System.out.println("String pair: (" + twoStr.getFirst() + ", " + twoStr.getSecond() + ")");

    }
}
