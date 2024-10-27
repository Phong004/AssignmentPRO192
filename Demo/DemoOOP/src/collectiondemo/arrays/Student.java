package collectiondemo.arrays;

public class Student implements Comparable<Student>{
    String code;
    String name;
    
    public Student() {
    }

    public Student(String code, String name) {
        this.code = code;
        this.name = name;
      
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   

    public void printScreen() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name +'}';
    }   

    @Override
    public int compareTo(Student o) {
        return  code.compareTo(o.getCode());
    }       
}
