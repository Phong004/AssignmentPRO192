package nestedclass;

public class Student {
    private String name;
    private String address;
    private String sex;
    private int score;


    public Student(String name, String address, String sex, int score) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.score = score;
    }

    class StudentOperator {

        public void print() {
            System.out.print(name + " -  " + address + " -  " + sex + " - " + score + ": ");
        }

        public void type() {
            if(score <5) {
                System.out.println("Hoc luc yeu");
            } else if (score >= 5 && score <= 8) {
                System.out.println("Hoc luc kha");
            }
            else {
                System.out.println("Hoc luc gioi");
            }
        }
    }

    public void typefStudent() {
        Student.StudentOperator studentOperator = this.new StudentOperator();
        studentOperator.print();
        studentOperator.type();
    }
}