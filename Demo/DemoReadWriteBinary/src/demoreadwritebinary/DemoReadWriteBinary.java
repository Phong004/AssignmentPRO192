package demoreadwritebinary;

import java.util.ArrayList;

public class DemoReadWriteBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ArrayList arr = new ArrayList();
            Student std = new Student("001", "Nguyen Tan");
            arr.add(std);
            arr.add(std);
            arr.add(std);
            arr.add(std);
            
            
            ObjectIOExample objFile = new ObjectIOExample();
            objFile.writePerObjectToFile("src/test.dat", arr);
            arr = (ArrayList)objFile.readArrayPerObjectFromFile("src/test.dat");
            for(Object obj : arr){
                 System.out.println(obj.toString()); 
            }
            //System.out.println(std.toString());            
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
    }
}
