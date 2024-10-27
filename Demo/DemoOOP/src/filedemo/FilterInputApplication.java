package filedemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilterInputApplication {
    public static void main(String[] args) throws Exception {
        InputStream inputObj = null;
        FilterInputStream filterInputObj = null;
        try {
            /* creates input stream objects */
            inputObj = new FileInputStream("C:/TestJava/Hello.txt");
            filterInputObj = new BufferedInputStream(inputObj);
            // reads and prints from filter input stream
            System.out.println((char) filterInputObj.read());
            System.out.println((char) filterInputObj.read());
            // invokes mark at this position
            filterInputObj.mark(0);
            System.out.println("mark() invoked");
            System.out.println((char) filterInputObj.read());
            System.out.println((char) filterInputObj.read());
        } catch (IOException e) {
            // prints if any I/O error occurs
            e.printStackTrace();
        } finally {
            // releases system resources associated with the stream
            if (inputObj != null) {
                inputObj.close();
            }
            if (filterInputObj != null) {
                filterInputObj.close();
            }
        }
    }
}
