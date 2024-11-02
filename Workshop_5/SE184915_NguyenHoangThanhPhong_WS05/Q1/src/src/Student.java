
public class Student implements Comparable<Student> {

    public String id;
    public String name;
    public double gpa;

    public Student() {
    }

    ;
    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other) {
        //TODO: you need to write your code here
        //return 1,0,or -1 depends on situation
        if (this.name.equals(other.name)) {
            if (this.gpa < other.gpa) {
                return -1;
            } else if (this.gpa > other.gpa) {
                return 1;
            }
        } else {
            return this.name.compareTo(other.name);
        }

        return 0;
    }
}
