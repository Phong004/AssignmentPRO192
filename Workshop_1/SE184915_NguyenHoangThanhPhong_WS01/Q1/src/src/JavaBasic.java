
import java.util.Arrays;


public class JavaBasic {

    public static boolean isPerfectNumber(int number) {
        //Enter your code here
        int sum=0; 
        for (int i=1; i<number; i++) {
           if (number%i==0) {
               sum+=i;
           }
        }
        if (sum == number) return true;
        else return false;
        //End
    }

    public static double avgOddArray(int[] a) {
        //Enter your code here
        double sum = 0; 
        int count = 0;
        for (int num: a) {
           if (num%2!=0) {
               sum += num;
               ++count;
           }
        }
        return (sum!=0)?sum/count:0.00;
        //End
    }

    public static int getSecondSmallest(int[] a) {
        //Enter your code here
        int ans=0;
        Arrays.sort(a);
        int min = a[0];
        for (int i=0; i<a.length; i++) {
            if (min < a[i]) {
                ans = a[i];
                break;
            }
        }
        return ans;
        //End
    }

    public static String removeAllSpace(String s) {
        //Enter your code here
        StringBuffer strBuff = new StringBuffer(s);
        while (strBuff.indexOf(" ")!=-1) {
            int index = strBuff.indexOf(" ");
            strBuff = strBuff.deleteCharAt(index);
        }
        return strBuff.toString();
        //End
    }
    

    public static String findLongestWord(String s) {
        //Enter your code here
        int maxLen = 0;
        String[] sArr = s.split(" ");
        String ans ="";
        for (int i=0; i<sArr.length; i++) {
            if (maxLen < sArr[i].length()) {
                ans = sArr[i];
                maxLen = sArr[i].length();
            }
        }
        return ans;
        
        //End
    }
}
