package ws1demo;

public class Students {

    String name, address, email, phone, code;
    Subjects course;
    private int[] scores = new int[5];

    public Students() {
    }

    public Students(Subjects course) {
        this.course = course;
    }

    public Students(String name, String address, String email, String phone, String code, Subjects course) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.code = code;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCourse(Subjects course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCode() {
        return code;
    }

    public Subjects getCourse() {
        return course;
    }

}
