package collectiondemo.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestArrayList {

    public static void main(String[] args) {
        //sort
        //Collections.sort(list);        
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student("001", "Nl C"));
        arr.add(new Student("003", "L A"));
        arr.add(new Student("002", "C B"));
        arr.add(new Student("004", "Tl D"));
        arr.add(new Student("005", "L E"));

//        for (Student std : arr) {
//            std.printScreen();
//        }
        Iterator i = arr.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
//        System.out.println("After remove");
//        Student stdRemove = (Student) arr.remove(0);
//
//        for (Student std : arr) {
//            std.printScreen();
//        }
//        System.out.println("After add");
//        arr.add(stdRemove);
//
//        for (Student std : arr) {
//            std.printScreen();
//        }

        Collections.sort(arr);
        System.out.println("Sort default (code)");
        for (Student std : arr) {
            std.printScreen();
        }

        Comparator com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(arr, com);
        System.out.println("Sort (name)");
        //Collections.sort(arr);
        for (Student std : arr) {
            std.printScreen();
        }

        System.out.println("min or max");
        Student s = Collections.min(arr);
        System.out.println(s);
        s = Collections.max(arr);
        System.out.println(s);

        System.out.println("Search");
        searchStudentByName(arr, "l");
    }

    public static void searchStudentByID(ArrayList<Student> arr, String id) {
        for (Student std : arr) {
            if (std.getCode().equalsIgnoreCase(id)) {
                std.printScreen();
            }
        }
    }

    public static void searchStudentByName(ArrayList<Student> arr, String name) {
        for (Student std : arr) {
            if (std.getName().contains(name)) {
                std.printScreen();
            }
        }
    }
}
