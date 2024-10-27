package reviewchapter5.exer4;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleSort {

    public static void main(String args[]) {
        Rectangle[] vec;
        vec = new Rectangle[5];
        double randomWidth = 0, randomHeight = 0;
        for (int index = 0; index < vec.length; index++) {
            randomWidth = 1000 * Math.random();
            randomHeight = 1000 * Math.random();
            vec[index] = new Rectangle(randomWidth, randomHeight);
            System.out.println(vec[index]);
        }

        Comparator com = new Comparator<Rectangle>() {
            @Override
            public int compare(Rectangle o1, Rectangle o2) {
                return (int) (o2.area() - o1.area());
            }
        };
        System.out.println("After sort:");
        Arrays.sort(vec, com);

        for (int index = 0; index < vec.length; index++) {
            System.out.println(vec[index]);
        }
    }
}
