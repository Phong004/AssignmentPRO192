package arraydemo;
public class TestArray {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);
        // Finding the langest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        System.out.println("Max is " + max);
        
        // Print all the array elements by methods
        printArray(new int[]{3, 1, 2, 6, 4, 2});
        System.out.println("");
        int[] array = reverse(new int[]{3, 1, 2, 6, 4, 2});
        printArray(array);
        System.out.println("");
    }
    
    public static void printArray(int[] array){
        
       // Print all the array elements
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } 
    }
    
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for(int i =0, j= list.length -1; i<list.length; i++, j--){
            result[j] = list[i];
        }
        return result;
    }
}
