/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phong
 */
public class Profession {

    private String name;
    private int age;
    private String major;

    public Profession() {
        name = "Nguyen Van A";
        age = 20;
        major = "Student";
    }

    public Profession(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            if (name.isEmpty()) {
                throw new Exception("(no name)");
            } else {
                this.name = name;
            }
        } catch (Exception e) {
            this.name = e.getMessage();
        }
    }

    @Override
    public String toString() {
        return String.format("%s-%d-%s", name, age, major);
    }
}
