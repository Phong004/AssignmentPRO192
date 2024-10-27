package student;

public class Student {

    private String code;
    public String name;
    int bYear;
    protected String address;

    public Student() {
    }

    public Student(String code, String name, int bYear) {
        this.code = code;
        this.name = name;
        this.bYear = bYear;
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

    public void printScreen(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", bYear=" + bYear + ", address=" + address + '}';
    }

}
