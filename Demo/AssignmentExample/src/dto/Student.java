package dto;

import java.io.Serializable;

public class Student implements Comparable<Student>,Serializable{
    private String studentID;
    private String studentName;
    private int birthYear;
    private String classNumber;

    public Student(String studentID, String studentName,int birthYear,String Number) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.birthYear = birthYear;
        this.classNumber = Number;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }
    
    public void print(){
        System.out.printf("%-10s|%-30s|%10s|%-5s\n", studentID,studentName,birthYear,classNumber);
    }

    @Override
    public String toString() {
        return studentID + "," +studentName+ "," + birthYear+ ":" + classNumber;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentID.compareTo(o.getStudentID());
    }
}
