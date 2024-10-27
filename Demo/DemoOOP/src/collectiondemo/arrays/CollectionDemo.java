/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author nguye
 */
public class CollectionDemo {

    public static void main(String[] arg) {
        ArrayList ar = new ArrayList();
        Vector v = new Vector();
        Random rd = new Random(); // MAXIMUM VALUE= 29
        for (int i = 1; i <= 5; i++) {
            ar.add(rd.nextInt(10));
            v.add(rd.nextInt(10));
        }

        System.out.println("ar=" + ar);
        System.out.println("v =" + v);
        boolean dis = Collections.disjoint(ar, v);

        System.out.println("ar and v are disjoint:" + dis);
        Collections.addAll(v, ar.toArray());
        System.out.println("After adding, v=" + v);
        dis = Collections.disjoint(ar, v);
        System.out.println("ar and v are disjoint:" + dis);
        

        int minVal = (int) Collections.min(v);
        int maxVal = (int) Collections.max(v);
        System.out.println("min= " + minVal + ", max= " + maxVal);
        int fre = Collections.frequency(v, 8);

        System.out.println("occurences of 8: " + fre);
        Collections.sort(v);
        Collections.reverse(v);
        System.out.println("After sorting, v=" + v);

        int pos = Collections.binarySearch(v, 8);

        System.out.println("Position of 8: " + pos);
        Collections.shuffle(v);
        System.out.println("Affter shuffling:" + v);
    }
}
