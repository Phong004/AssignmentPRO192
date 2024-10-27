package demoreadwritebinary;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOExample1 {

    public static void writeObject(String filename, Object obj) throws Exception {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            try (ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                objectOut.writeObject(obj);
                objectOut.close();
            }
            System.out.println("The Object  was succesfully written to a file");
            fileOut.close();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public static void writePerObject(String filename, Object[] obj) throws Exception {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            try (ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                for (Object o : obj) {
                    objectOut.writeObject(o);
                }
                objectOut.close();
            }
            System.out.println("The Object  was succesfully written to a file");
            fileOut.close();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public static Object readObject(String filename) throws Exception {
        try {
            Object obj;
            FileInputStream fileIn = new FileInputStream(filename);
            try (ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
                obj = objectIn.readObject();
                objectIn.close();
            }
            System.out.println("The Object  was succesfully read from a file");
            fileIn.close();
            return obj;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public static Object[] readPerObject(String filename) throws Exception {
        Object[] result = new Object[2];
        FileInputStream fileIn = null;
        ObjectInputStream objectIn = null;
        try {

            fileIn = new FileInputStream(filename);
            objectIn = new ObjectInputStream(fileIn);
            Object obj;
            int count = 0;
            while ((obj = objectIn.readObject()) != null) {
                result[count++] = obj;
            };
            objectIn.close();
            fileIn.close();
            System.out.println("The Object  was succesfully read from a file");

        } catch (EOFException eof) {
            System.out.println("Error EOF");
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (objectIn != null) {
                objectIn.close();
            }
            if (fileIn != null) {
                fileIn.close();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //Student std = new Student("001", "Nguyen Tan");
            //ObjectIOExample1.writeObject("src/test.dat", std);
            Student[] std = new Student[2];
            std[0] = new Student("001", "Nguyen Tan");
            std[1] = new Student("002", "Phuc");
            ObjectIOExample1.writePerObject("src/test.dat", std);

            Object[] obj = ObjectIOExample1.readPerObject("src/test.dat");
            for (Object o : obj) {
                System.out.println(o.toString());
            }

        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
    }
}
