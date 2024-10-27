package demoreadwritebinary;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class ObjectIOExample {

    public void writeObjectToFile(String filepath, Object serObj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            try (ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                objectOut.writeObject(serObj);
                objectOut.close();
            }
            System.out.println("The Object  was succesfully written to a file");
            fileOut.close();
        } catch (IOException ex) {
        }
    }

    public void writePerObjectToFile(String filepath, ArrayList<Student> serObj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            try (ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                //objectOut.writeObject(serObj);
                for (Student obj : serObj) {
                    objectOut.writeObject(obj);
                }
                objectOut.close();
            }
            //System.out.println("The Object  was succesfully written to a file");
            fileOut.close();
        } catch (IOException ex) {
        }
    }

    public ArrayList<Student> readArrayPerObjectFromFile(String filepath) throws ClassNotFoundException, IOException {
        ArrayList<Student> arr = new ArrayList<>();
        FileInputStream fileIn = null;
        ObjectInputStream objectIn = null;
        try {
            fileIn = new FileInputStream(filepath);
            objectIn = new ObjectInputStream(fileIn);
            Object obj;
            while ((obj = objectIn.readObject()) != null) {
                if (obj instanceof Student) {
                    arr.add((Student) obj);
                }
            }
            objectIn.close();
            fileIn.close();
            //System.out.println("The Object was succesfully reading from a file");
        } catch (EOFException eof) {
            
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
        return arr;
    }

    public void writeObjectToFile(String filepath, ArrayList<Student> serObj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            try (ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                objectOut.writeObject(serObj);
                objectOut.close();
            }
            System.out.println("The Object  was succesfully written to a file");
            fileOut.close();
        } catch (IOException ex) {
        }
    }

    public Student readObjectFromFile(String filepath) throws Exception {
        Student student = null;
        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            student = (Student) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("The Object was succesfully reading from a file");
        } catch (Exception ex) {
            throw ex;
        }
        return student;
    }

    public ArrayList<Student> readArrayObjectFromFile(String filepath) throws ClassNotFoundException {
        ArrayList<Student> arr = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            arr = (ArrayList<Student>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("The Object was succesfully reading from a file");
        } catch (IOException ex) {

        }
        return arr;
    }
}
