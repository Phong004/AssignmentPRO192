package fileio;
import model.Employee;
import java.util.List;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phong
 */
public class EmployeeFileBinary implements IFileReadWrite<Employee> {
    
    private String FILE_NAME = "src\\Data\\Employee.dat";
    
    @Override
    public List<Employee> read() throws Exception {
        List<Employee> list = null;
        FileInputStream fileIn;
        ObjectInputStream objIn;
        try {
            fileIn = new FileInputStream(FILE_NAME);
            objIn = new ObjectInputStream(fileIn);
            Object obj = objIn.readObject();
            list = (List<Employee>) obj;
            objIn.close();
            fileIn.close();
        } catch (Exception e) {
            throw e;
        }
        return list;
    }
    
    @Override
    public boolean write(List<Employee> list) throws Exception {
        FileOutputStream fileOut;
        ObjectOutputStream objOut;
        try {
            fileOut = new FileOutputStream(FILE_NAME);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(list);
            objOut.close();
            fileOut.close();
        } catch (Exception e) {
            throw e;
        }
        return true;
    }
}
