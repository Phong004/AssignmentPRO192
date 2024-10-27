package dbo;

import dto.Student;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class FileTextExam implements FileExam {

    private final String filepath = "src/dbo/Students.txt";

    @Override
    public void outputToFileStudent(ArrayList stdList) throws Exception {
        File f;
        FileOutputStream file;
        BufferedWriter myOutput;// create Buffer    
        try {
            f = new File(filepath);//open file

            String fullPath = f.getAbsolutePath(); //get Fullpath of file
            file = new FileOutputStream(fullPath);
            myOutput = new BufferedWriter(new OutputStreamWriter(file));
            // write line until the end of the file
            for (int i = 0; i < stdList.size(); i++) {
                if (i > 0) {
                    myOutput.newLine();
                }
                myOutput.write((i + 1) + "," + stdList.get(i).toString());
            }
            myOutput.close();
        } catch (Exception ex) {
            throw ex;
        }
    }

    @Override
    public ArrayList inputFromFileStudent() throws Exception {
        ArrayList stdList = null;
        try {
            String thisLine; // content to read each line.
            BufferedReader myInput;// create Buffer

            File f = new File(filepath);//open file
            System.out.println(filepath);

            String fullPath = f.getAbsolutePath(); //get Fullpath of file
            System.out.println("Fullpath: " + fullPath);
            if (!f.exists()) {
                return null;
            }
            
            FileInputStream file = new FileInputStream(fullPath);
            myInput = new BufferedReader(new InputStreamReader(file));
            // read line until the end of the file
            while ((thisLine = myInput.readLine()) != null) {
                if (!thisLine.trim().isEmpty()) {
                    String[] split = thisLine.split(",");
                    //ID, brand name, sound brand:price
                    // Split[0] STT, Split[1] ID, split[2] name, split[3] birth:class
                    if (stdList == null) {
                        stdList = new ArrayList<>();
                    }
                    String id = split[1];
                    String name = split[2];
                    String[] tempS = split[3].split(":");//[0]: year, [1]: class
                    int year = Integer.parseInt(tempS[0]);
                    String className = tempS[1];
                    Student std = new Student(id, name, year, className);
                    stdList.add(std);
                }
            }
            myInput.close();

        } catch (Exception ex) {
            throw ex;
        }
        return stdList;
    }
}
