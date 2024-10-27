package filedemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;


public class FileClassExp {

    public static void main(String[] args) throws IOException {
        // write your code here
        String filename = "D:/TestJava/demoNewEmpty.txt";
        String pathFolder = "D:/TestJava";
        //testCreateEmptyFile("D:/TestJava/demoEmpty.txt");
        //testMakeDirectory(pathFolder+"/temp");
        //testListDirectory(pathFolder);
        testFile(filename);
    }

    public static void testCreateEmptyFile(String filename) throws IOException {
        File file = new File(filename);
        //Tạo file với đường dẫn filename
        if (file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File not created");
        }
    }

    public static void testCreateTempFile() throws IOException {
        File tempFile = File.createTempFile("OOP", ".log");
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        writer.write("I love Java");
        writer.close();
        FileInputStream fis = new FileInputStream(tempFile);
        int i = -1;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        tempFile.deleteOnExit();
    }

    public static void testMakeDirectory(String pathFolder) throws IOException {
        File newDir = new File(pathFolder);
        if (newDir.mkdir()) {
            System.out.println("Directory created");
        } else {
            System.out.println("Directory not created");
        }
    }

    public static void testListDirectory(String pathFolder) throws IOException {
        File newDir = new File(pathFolder);
        String[] str = newDir.list();
        for (String s:str){
            System.out.println(s);
        }
    }

    public static void testFile(String filename) throws IOException {
        File fileObj = new File(filename);
        System.out.println("Path is: " + fileObj.getPath());
        System.out.println("Name is: " + fileObj.getName());
        System.out.println("File exists is: " + fileObj.exists());
        System.out.println("File is: " + fileObj.isFile());
        System.out.println("Directory is: " + fileObj.isDirectory());
        System.out.println("Full path is: " + fileObj.getAbsolutePath());
        System.out.println("Read is: " + fileObj.canRead());
        System.out.println("Write is: " + fileObj.canWrite());
        System.out.println("Parent is: " + fileObj.getParentFile());
    }
}
