/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.util.Objects;
import java.lang.Math;

/**
 *
 * @author phong
 */

public abstract class Employee implements ITextFileOutPut, Serializable {

    private final String empID;
    private String empName;
    private double baseSal;
    
    private static String capitalizeString(String name) {
        name = name.trim().toLowerCase();
        char[] charArr = name.toCharArray();
        boolean first = true;
        String re = "";
        for (char c : charArr) {
            if (first && Character.isLetter(c)) {
                re = re.concat(String.valueOf(c).toUpperCase());
                first = false;
            }
            else if (!first && Character.isWhitespace(c)) {
                re = re.concat(String.valueOf(c));
                first = true;
            }
            else if (Character.isLetter(c)) {
                re = re.concat(String.valueOf(c));
            }
        }
        return re;
    }

    public Employee(String empID, String empName, double baseSal) {
        this.empID = empID;
        this.empName = capitalizeString(empName);
        this.baseSal = baseSal;
    }

    public void setEmpName(String empName) {
        this.empName = capitalizeString(empName);
    }

    public void setBaseSal(double baseSal) {
        this.baseSal = baseSal;
    }
    
    public String getEmpID() {
        return empID;
    }
    
    public String getEmpName() {
        return empName;
    }
    
    double getBaseSalary() {
        return baseSal;
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return String.format("%s_%s_%.2f", empID, empName, baseSal);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else if (obj == null) {
            return false;
        }
        else if (getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }
    
    public String toFileString() {
        return toString();
    }
}
