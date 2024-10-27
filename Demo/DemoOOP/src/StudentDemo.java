import student.Student;

public class StudentDemo {

    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name);
        Student stu1 = new Student("SE321", "Tuan", 2002);
        System.out.println(stu1.name);
        stu1.setName("PRO");
        System.out.println(stu1.getName());
        Student stu2 = new Student("SE321", "Tuan", 2002, "TPHCM");
        stu2.printScreen();
    }
}
