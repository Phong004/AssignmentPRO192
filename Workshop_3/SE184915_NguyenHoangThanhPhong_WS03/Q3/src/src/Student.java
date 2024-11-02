/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Hoang Thanh Phong
 */
public abstract class Student {
    private String rollNumber;
    private String name;
    private String phone;
    
    public Student() {}
    public Student(String rollNumber, String name, String phone) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.phone = phone;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return rollNumber+","+name+","+phone;
    }
    
    public abstract double mediumScore();
    public abstract String classification();
}
