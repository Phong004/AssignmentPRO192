
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    String inputString() throws Exception {
        Scanner sc = new Scanner(System.in);
        String pattern = "SE\\d{3}";
        String s;
        System.out.print("Input a string: ");
        s = sc.next();
        if (!s.matches(pattern)) {
            throw new Exception();
        }
        return s;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        boolean cont = false;
        do {
            try {
                String s = obj.inputString();
                System.out.println("The string is " + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");
                cont = true;
            }
        } while (cont);
    }

    public static String capitalizeString(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i])) {
                found = false;
            }
        }
        return String.valueOf(chars);
    }

    private int[] a = {1, 3, -5, -2};

    public void mult(int amt) {
        int i = 0;
        while (i < a.length) {
            a[i] = a[i++] * amt;
        } // end while
    } // end method
}
