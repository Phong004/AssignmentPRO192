package arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExp {

    //Input Array from monitor
    public static int[] inputArray(Scanner scan) {
        int arr[];
        int n = 0;

        System.out.print("Enter no. of elements you want in array:");
        n = scan.nextInt();
        arr = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    //Print Array to monitor
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    //Find index of element; If none return -1
    public static int findIndexOf(int[] arr, int element) {
        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {
            // if the i-th element is t
            // then return the index
            if (arr[i] == element) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    //Remove element at index
    public static int[] removeTheElementAtIndex(int[] arr, int index) {
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {
            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }
            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }
        // return the resultant array
        return anotherArray;
    }

    //Remove element at index
    public static int[] removeTheElement(int[] arr, int element) {
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null) {
            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {
            // if the element is
            // the removal element index
            if (arr[i] == element) {
                continue;
            }
            // if the another element is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }
        // return the resultant array
        return anotherArray;
    }

    //Insert element at index
    public static int[] insertTheElementAtIndex(int[] arr, int index, int element) {
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null && index != 0) {
            return arr;
        }
        if (arr != null && (index < 0 || index >= arr.length)) {
            return arr;
        }

        // Create another array of size one more
        int[] anotherArray;

        //If array is null and insert at index 0
        if (arr == null) {
            anotherArray = new int[1];
            anotherArray[index] = element;
            return anotherArray;
        }
        // insert the elements from
        // the old array into the new array
        // insert all elements till pos
        // then insert x at pos
        // then insert rest of the elements
        anotherArray = new int[arr.length];
        for (int i = 0; i < arr.length + 1; i++) {
            if (i < index - 1) {
                anotherArray[i] = arr[i];
            } else if (i == index - 1) {
                anotherArray[i] = element;
            } else {
                anotherArray[i] = arr[i - 1];
            }
        }
        // return the resultant array
        return anotherArray;
    }

}
