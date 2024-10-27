package inheritance;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        //Student s1 = new Student("001", "IA", "Gra", "Huy", "Quan 9", "20/09/2001", "0123456789");

        Person per = new Person();
        System.out.println("Person per = new Person");
        per.eat();
        per.run();
        if (per instanceof Person) {
            System.out.println("I'm Person");
        }

        per = new Student();
        System.out.println("Person per = new Student");
        per.eat();
        per.run();
        if (per instanceof Student) {
            System.out.println("I'm Student");
            ((Student) per).study();
        }

        Student stu = new Student();
        System.out.println("Student per = new Student");
        stu.eat();
        stu.cry();
        stu.run();
        if (stu instanceof Person) {
            System.out.println("I'm Person");
        }

//        Professor pro = new Professor();
//        System.out.println("Professor per = new Professor");
//        // pro.run();
//        if (pro instanceof Professor) {
//            System.out.println("I'm Professor");
//        }
        //stu.run();
//        HinhTru ht = new HinhTru(5, 2);
//        ht.getRadius();
//        ht.radius = 1;
//        String s =ht.toString();
//        System.out.println(s);
    }

}
