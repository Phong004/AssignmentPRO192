/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRO192;

/**
 *
 * @author nguye
 */
public class Student {

    String code;
    String name;
    int bYear;
    String address;

    public Student() {
    }

    public Student(String code, String name, int bYear, String address) {
        this.code = code;
        this.name = name;
        this.bYear = bYear;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getbYear() {
        return bYear;
    }

    public String getAddress() {
        return address;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setbYear(int bYear) {
        this.bYear = bYear;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   
    public void input() {
        System.out.println("input");
    }

    public void output() {
        System.out.println("output");
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", bYear=" + bYear + ", address=" + address + '}';
    }

    public static void main(String avg[]) {
        Student student = new Student();
        student.input();
        student.output();        
        System.out.println(student.getAddress());

        Student student1 = new Student("SE001", "Minh", 2001, "HCM");
        student1.input();
        student1.output();
        student1.setAddress("Q9");
        student1.output();        
    }
}
