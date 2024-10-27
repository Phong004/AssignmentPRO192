package filedemo;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FIStream {

    public static void main(String argv[]) {
        //testFileInputStream();
        try {
            Scanner sc = new Scanner(System.in);
            int choice = -1;
            do {
                System.out.println("1. Test FileOutputStream");
                System.out.println("2. Test FileInputStream");
                System.out.println("3. Test DataOutputStream");
                System.out.println("4. Test DataInputStream");
                System.out.println("0. Exit");
                System.out.println("Enter choice:");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        testFileOutputStream();
                        break;
                    case 2:
                        testFileInputStream();
                    case 3:
                        testDataOutputStream();
                        break;
                    case 4:
                        testDataInputStream();
                }
            } while (choice >= 1 && choice < 5);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    //Sử dụng FileOutputStream
    public static void testFileOutputStream() throws IOException {

        FileOutputStream fout = new FileOutputStream("D:/TestJava/FileStream.txt");
        int[] a = {32, 97, 98, 4, 5, 6, 127, 8, 9, 10, 65, 66, 67, 68};

        for (int i = 0; i < a.length; i++) {
            fout.write(a[i]);
        }
        fout.close();
        System.out.println("Finish");
    }

    public static void testFileInputStream() {
        try {
            FileInputStream intest;
            intest = new FileInputStream("D:/TestJava/FileStream.txt");
            int ch;
            while ((ch = intest.read()) > -1) {
                StringBuffer buf = new StringBuffer();
                buf.append((char) ch);
                System.out.print(buf.toString());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Đọc và ghi lần lượt từng byte
    public static void testFileInOutStream() throws IOException {

        FileOutputStream fos;
        try ( FileInputStream fis = new FileInputStream("D:/TestJava/input.txt")) {
            fos = new FileOutputStream("D:/TestJava/output.txt");
            int i = -1;
            // Đọc lần lượt các byte (8bit) trong luồng và lưu vào biến i
            // Khi đọc ra giá trị -1 nghĩa là kết thúc luồng.
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
                fos.write(i);
            }
        }
        fos.close();
    }

    //Sử dụng DataInputStream
    public static void testDataOutputStream() throws IOException {
        String name = "iloveJavaOOP";

        OutputStream file = new FileOutputStream("D:/TestJava/DataStream.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.writeUTF(name);
        data.flush();
        data.close();
    }

    //Sử dụng DataOutputStream
    public static void testDataInputStream() throws IOException {
        InputStream input = new FileInputStream("D:/TestJava/DataStream.txt");
        DataInputStream inst = new DataInputStream(input);

        String content = inst.readUTF();
        System.out.println("Content: " + content);
        inst.close();
    }
    
    //Đọc và ghi lần lượt nhiều byte
    public static void testFileInOutStreamNByte() throws IOException {

        FileOutputStream fos;
        try ( FileInputStream fis = new FileInputStream("D:/TestJava/input.txt")) {
            fos = new FileOutputStream("D:/TestJava/output.txt");
            int i = -1;
            byte[] bytes = new byte[10];// Đọc 10 byte 1 thời điểm
            while ((i = fis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, i));
                fos.write(bytes, 0, i);
            }
        }
        fos.close();
    }

    //Sử dụng ByteArrayInputStream
    public static void testByteArrayInputStream() throws IOException {

        byte[] buf = new byte[]{'i', 'l', 'o', 'v', 'e', 'J', 'A', 'V', 'A', 'O', 'O', 'P'};
        // Create the new byte array input stream
        ByteArrayInputStream byt = new ByteArrayInputStream(buf);
        int k = 0;
        while ((k = byt.read()) != -1) {
            // Conversion of a byte into character
            char ch = (char) k;
            System.out.println("ASCII value of Character is:" + k + " - Special character is: " + ch);
        }
    }

        //Sử dụng FileReader và FileWriter (Character Stream)
    public static void testCharacterStream() {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("D:/TestJava/input.txt");
            out = new FileWriter("D:/TestJava/output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
