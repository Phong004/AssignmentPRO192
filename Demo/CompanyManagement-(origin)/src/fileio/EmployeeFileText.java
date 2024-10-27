/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import model.Employee;

/**
 *
 * @author nguye
 */
public class EmployeeFileText implements IFileReadWrite<Employee> {

    private final String FILE_NAME = "src/fileio/Employee.txt";

    @Override
    public List<Employee> read() throws Exception {
        return null;
    }

    @Override
    public boolean write(List<Employee> list) throws Exception {
        return true;
    }

}
