/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Hoang Thanh Phong
 */
import java.lang.Math;

public class StudentInIT extends Student{
    private int basic;
    private int specialized;
    private int internship;
    
    public StudentInIT() {}
    public StudentInIT(String rollNumber, String name, String phone, int basic, int specialized, int internship) {
        super(rollNumber, name, phone);
        this.basic = basic;
        this.specialized = specialized;
        this.internship  = internship;
    }
    
    public void setBasic(int basic) {
        if (basic>=0 && basic <=10) this.basic = basic;
        else System.out.println("Incorrect");
    }
    public void setSpecialized(int specialized) {
        if (specialized>=0 && specialized<=10) this.specialized = specialized;
        else System.out.println("Incorrect");
    }
    public void setInternship(int internship) {
        if (internship>=0 && internship<=10) this.internship = internship;
    }
    
    public int getBasic() {
        return basic;
    }

    public int getSpecialized() {
        return specialized;
    }

    public int getInternship() {
        return internship;
    }
    
    @Override
    public double mediumScore() {
        double avg = (double)(basic + specialized + internship) / 3;
        double ans = avg*100;
        return Math.round(ans)/100.0;
    }
    @Override
    public String classification() {
        if (mediumScore()<5) return "Weak student";
        else if (mediumScore()<7) return "Average academic";
        else if (mediumScore()<8.5) return "Good academic";
        else return "Excellent Student";
    }
}