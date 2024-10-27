package collectiondemo.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    static boolean flagDebug = true;

    public static void main(String[] arg) {
        Set set = new TreeSet();

        //addTwice(set);
        //testTreeSet();
        //testHashSet();
        //testStudent();
        testStudent2();
    }

    static void addTwice(Set set) {
        set.clear();
        int p1 = 5;
        int p2 = 5;
        set.add(p1);
        set.add(p2);
        System.out.println(set.size());

        int p3 = 10;
        set.add(p3);
        System.out.println(set.size());
    }

    static void testTreeSet() {
        Random r = new Random();
        TreeSet myset = new TreeSet();
        System.out.print("Input TreeSet : ");
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(100);
            myset.add(number);
            if (flagDebug) {
                System.out.print(number + " ");
            }
        }
        System.out.println("");
        System.out.print("Output TreeSet : ");
        //using Iterator
        Iterator iter = myset.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println("");

        System.out.print("Output Desc TreeSet : ");
        //using Iterator
        iter = myset.descendingIterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println("");

        System.out.print("Foreach : ");
        //using Iterator
        for (Object i : myset) {
            System.out.print(i + " ");
        }
    }

    static void testHashSet() {
        Random r = new Random();
        HashSet myset = new HashSet();
        System.out.print("Input HashSet : ");
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(100);
            myset.add(number);
            System.out.print(number + " ");
        }
        System.out.println("");
        System.out.print("Output HashSet : ");
        //using Iterator
        Iterator iter = myset.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }

    static void testStudent() {
        Random r = new Random();
        TreeSet<Student> myset = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            int no = r.nextInt(100);
            Student st = new Student(Integer.toString(no), "abc");
            myset.add(st);
            System.out.print(no + " ");
        }
        System.out.println("");
        //using Iterator
        Iterator iter = myset.iterator();
        while (iter.hasNext()) {
            Student st = (Student) iter.next();
            System.out.println("No: " + st.getCode() + "_" + st.getName());
        }
    }

    static void testStudent2() {

        TreeSet<Student> myset = new TreeSet<>();
        myset.add(new Student("SE002", "A"));
        myset.add(new Student("SE001", "B"));
        myset.add(new Student("SE005", "C"));
        myset.add(new Student("SE004", "D"));
        myset.add(new Student("SE003", "E"));
        myset.add(new Student("SE006", "F"));
        myset.add(new Student("SE007", "G"));
        myset.add(new Student("SE008", "H"));
        myset.add(new Student("SE008", "I"));
        myset.add(new Student("SE001", "B"));
        System.out.println("");
        for(Student st:myset){
            System.out.println(st);
        }
        //using Iterator
//        Iterator iter = myset.iterator();
//        while (iter.hasNext()) {
//            Student st = (Student) iter.next();
//            System.out.println(st);
//        }
        //Find SE006
//        int count = 0;
//        while (iter.hasNext()) {
//            Student st = (Student) iter.next();
//            if(st.getCode().compareTo("SE006")==0){
//                st.printScreen();
//                count ++;
//                break;
//            }
//        }
//        if(count ==0 )
//            System.out.println("No: SE006 not exist!");

//        Student st = new Student("SE006");
//        Student found = (Student) myset.ceiling(st);
//        if (found == null) {
//            System.out.println("No: SE006 not exist!");
//        } else if (found.getCode().compareTo("SE006") == 0) {
//            found.printScreen();
//        } else {
//            System.out.println("No: SE006 not exist!");
//        }
    }
}
