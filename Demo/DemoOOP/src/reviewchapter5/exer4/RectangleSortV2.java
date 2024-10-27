
package reviewchapter5.exer4;

import java.util.Arrays;

public class RectangleSortV2 {
    public static void main(String args[]) {
        RectangleV2[] vec;
        vec = new RectangleV2[5];
        double randomWidth = 0, randomHeight = 0;
        for (int index = 0; index < vec.length; index++) {
            randomWidth = 1000 * Math.random();
            randomHeight = 1000 * Math.random();
            vec[index] = new RectangleV2(randomWidth, randomHeight);
            System.out.println(vec[index]);
        }
        
        System.out.println("After sort:");
        Arrays.sort(vec);

        for (int index = 0; index < vec.length; index++) {
            System.out.println(vec[index]);
        }
    }
}
