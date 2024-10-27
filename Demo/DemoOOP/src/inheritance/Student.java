package inheritance;

public class Student extends Person {

    protected String studentId;
    protected String majorField;
    protected String degreeSought;

    public Student() {
        super();
    }

    public Student(String name, String address, String birthDate,
            String idNumber, String studentId, String majorField, String degreeSought) {
        super(name, address, birthDate, idNumber);
        this.studentId = studentId;
        this.majorField = majorField;
        this.degreeSought = degreeSought;
    }

    public static void run() {
        System.out.println("Student run!");
    }

    @Override
    public void eat() {
        System.out.println("Student call super!");
        super.eat();
    }

    public void study() {
        System.out.println("I'm studing PRO192!");
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", majorField=" + majorField + ", degreeSought=" + degreeSought + '}';
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajorField() {
        return majorField;
    }

    public void setMajorField(String majorField) {
        this.majorField = majorField;
    }

    public String getDegreeSought() {
        return degreeSought;
    }

    public void setDegreeSought(String degreeSought) {
        this.degreeSought = degreeSought;
    }

}
