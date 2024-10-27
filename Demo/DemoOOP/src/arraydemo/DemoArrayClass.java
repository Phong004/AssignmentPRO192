package arraydemo;

import java.util.Arrays;
import java.util.Comparator;

public class DemoArrayClass {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        String str = Arrays.toString(arr);
        System.out.println(str);

//        System.out.println("Copy");
        int[] copyArr = copyArray(arr, 3);
//        str = Arrays.toString(copyArr);
//        System.out.println(str);
//        
//        System.out.println("Copy call Arrays methods");
//        copyArr = Arrays.copyOf(arr, 3);
//        str = Arrays.toString(copyArr);
//        System.out.println(str);
//
//        System.out.println("Copy range");
//        copyArr = Arrays.copyOfRange(arr, 8, 11);
//        str = Arrays.toString(copyArr);
//        System.out.println(str);
//        System.out.println("Copy range call Arrays methods");
//        copyArr = copyArray(arr, 8, 11);
//        str = Arrays.toString(copyArr);
//        System.out.println(str);
//        System.out.println("String");
//        str = toStringArray(arr);
//        System.out.println(str);
//        System.out.println("String call Arrays methods");
//        str = Arrays.toString(arr);
//        System.out.println(str);

        System.out.println("Sort");
        copyArr = Arrays.copyOf(arr, 10);
        sortArray(arr);
        str = Arrays.toString(arr);
        System.out.println(str);
        System.out.println("Sort call Arrays methods");
        copyArr = Arrays.copyOf(arr, 10);
        str = Arrays.toString(arr);
        System.out.println(str);
        System.out.println("After");
        Arrays.sort(copyArr);
        str = Arrays.toString(copyArr);
        System.out.println(str);        
//       
//        System.out.println("Search");
//        int index = search(arr, 9);
//        System.out.println(index);
//        System.out.println("Search call Arrays methods");
//        index = Arrays.binarySearch(arr, 9);        
//        System.out.println(index);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static int[] copyArray(int[] arr, int len) {

        int[] result = new int[len];
        int i = 0;
        for (; i < len && i < arr.length; i++) {
            result[i] = arr[i];
        }
        for (; i < len; i++) {
            result[i] = 0;
        }
        return result;
    }

    public static int[] copyArray(int[] arr, int beginIndex, int endIndex) {

        int[] result = new int[endIndex - beginIndex];
        int i = beginIndex;
        for (; i < endIndex && i < arr.length; i++) {
            result[i - beginIndex] = arr[i];
        }
        for (; i < endIndex; i++) {
            result[i - beginIndex] = 0;
        }
        return result;
    }

    public static String toStringArray(int[] arr) {
        String result = "{";
        int i = 0;
        for (; i < arr.length; i++) {
            result += arr[i] + " ";
        }

        return result + "}";
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

    }

    public static int search(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

}
