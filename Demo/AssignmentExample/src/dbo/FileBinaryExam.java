package dbo;

import dto.Student;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import utilities.Validation;

public class FileBinaryExam implements FileExam {

    private final String filepath = "src/dbo/student.dat";

    @Override
    public void outputToFileStudent(ArrayList stdList) throws Exception {
        FileOutputStream fileOut;
        ObjectOutputStream objectOut;
        try {
            fileOut = new FileOutputStream(filepath);
            objectOut = new ObjectOutputStream(fileOut);
            //objectOut.writeObject(serObj);
            for (Object obj : stdList) {
                objectOut.writeObject(obj);
            }
            objectOut.close();
            fileOut.close();
        } catch (Exception ex) {
            throw ex;
        }
    }

    @Override
    public ArrayList inputFromFileStudent() throws Exception {
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

    public void outputArrayToFileStudent(Object stdList) throws Exception {
        FileOutputStream fileOut;
        ObjectOutputStream objectOut;
        try {
            fileOut = new FileOutputStream(filepath);
            objectOut = new ObjectOutputStream(fileOut);
            
            objectOut.writeObject(stdList);

            objectOut.close();
            fileOut.close();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public ArrayList inputArrayFromFileStudent() throws Exception {
        ArrayList<Student> arr = new ArrayList<>();
        FileInputStream fileIn = null;
        ObjectInputStream objectIn = null;
        try {
            fileIn = new FileInputStream(filepath);
            objectIn = new ObjectInputStream(fileIn);
            arr = (ArrayList) objectIn.readObject();
            objectIn.close();
            fileIn.close();
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
    
    public boolean checkExistFile(){
        return Validation.checkFileExists(filepath);
    }
}
