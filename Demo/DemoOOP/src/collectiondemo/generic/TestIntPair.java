package collectiondemo.generic;

import java.util.Scanner;
public class TestIntPair {

    public static void main(String[] args) {

        IntPair range = new IntPair(-5, 20);
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.printf("Enter a number in (%d to %d): ",
                    range.getFirst(), range.getSecond());

            input = sc.nextInt();

        } while( input < range.getFirst() ||
                input > range.getSecond() );
    }
}

