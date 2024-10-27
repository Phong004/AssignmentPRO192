package inheritance;

public class Professor extends Person {

    protected String department;

    public Professor(String department, String name, String address, 
            String birthDate, String idNumber) {
        super(name, address, birthDate, idNumber);
        this.department = department;
    }

    public Professor() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void instruct() {
        System.out.println("I'm instructor!");
    }

    @Override
    public String toString() {
        return "Professor{" + "department=" + department + '}';
    }  
}
