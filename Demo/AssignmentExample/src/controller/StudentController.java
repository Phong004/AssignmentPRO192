package controller;

import dbo.FileBinaryExam;
import dbo.FileTextExam;
import dto.Student;
import java.util.ArrayList;
import java.util.Collections;
import utilities.Validation;

public class StudentController {

    private ArrayList<Student> studentList;

    public StudentController() throws Exception {
        loadData();
    }

    private void loadData() throws Exception {
        try {
            FileBinaryExam file = new FileBinaryExam();
//            FileTextExam file = new FileTextExam();
//            if (!file.checkExistFile()) {
//                return;
//            }
            studentList = file.inputFromFileStudent();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void addStudent() {
        String id, name, classNumber;
        int birthyear;
        String idPattern = "^[A-Z]{2}\\d{3}$";

        while (true) {
            id = Validation.checkString("Please, input ID (Ex: AB123): ");
            Student chechId = searchStudentById(id);
            if (chechId == null && id.matches(idPattern)) {
                break;
            } else if (!id.matches(idPattern)) {
                System.out.println("Please re-enter the ID!");
            } else {
                System.out.println("Duplicate ID. Try with anther one!");
            }
        }
        name = Validation.checkString("Please, input name of student: ");
        birthyear = Validation.checkInt("Please, input birthdate: ");
        classNumber = Validation.checkString("Please, input class Number: ");

        if (studentList == null) {
            studentList = new ArrayList<>();
        }
        studentList.add(new Student(id, name, birthyear, classNumber));
        System.out.print((char) 27 + "[30m");
        System.out.println("\033[0;32m" + "The new food has been added successfully!!");
        System.out.print((char) 27 + "[30m");
    }

    public void updateStudent() {

    }

    public void deleteStudent() {
        if (studentList == null || studentList.isEmpty()) {
            System.out.printf("Student list is empty\n");
            return;
        }

        String input = Validation.checkString("Input Id Student want to delete: ");
        int count = -1;

        for (int i = 0; i < studentList.size(); i++) {
            Student object = (Student) studentList.get(i);
            if (object.getStudentID().compareTo(input) == 0) {
                count = i;
                break;
            }

        }
        if (count == 0) {
            System.out.printf("No student has id %s\n", input);
        } else {
            String confirmRemove = Validation.checkYesNo("Are you sure you want to delete this student?\n  Press:\n    Y = Yes\n    N = No \nPlease input your choice: ");
            if (confirmRemove.equalsIgnoreCase("Y")) {
                studentList.remove(count);
                System.out.println("\033[0;32m" + "Remove successful!");
                System.out.print((char) 27 + "[30m");
            } else if (confirmRemove.equalsIgnoreCase("N")) {
                System.err.println("No data is deleted!");
            }
        }
    }

    public void searchStudentByName() {
        if (studentList == null || studentList.isEmpty()) {
            System.out.printf("Student list is empty\n");
            return;
        }

        String inputName = Validation.checkString("Input name want to search: ");
        int count = 0;

        for (Student std : studentList) {
            if (std.getStudentName().toLowerCase().contains(inputName.toLowerCase())) {
                if (count == 0) {
                    System.out.printf("%-10s|%-30s|%-8s|%-5s\n", "Student ID", "Student Name", "Birth Year", " Class");
                }
                std.print();
                count++;
            }

        }
        if (count == 0) {
            System.out.printf("No student has name %s\n", inputName);
        }
    }

    public Student searchStudentById(String studentId) {
        if (studentList == null || studentList.isEmpty()) {
            return null;
        }
        for (Student std : studentList) {
            if (std.getStudentID().compareTo(studentId) == 0) {
                return std;
            }
        }
        return null;
    }

    public void saveStudent() throws Exception {
        try {
//            FileTextExam file = new FileTextExam();
//            file.outputToFileStudent(studentList);
            FileBinaryExam file = new FileBinaryExam();
            file.outputToFileStudent(studentList);
            //file.outputArrayToFileStudent(studentList);
            System.out.printf("Save file successful\n");
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void sortStudent() {
        if (studentList == null || studentList.isEmpty()) {
            System.out.printf("Student list is empty\n");
            return;
        }
        Collections.sort(studentList);
    }

    public void printStudent() {
        if (studentList == null || studentList.isEmpty()) {
            System.out.printf("Student list is empty\n");
            return;
        }
        System.out.printf("%-10s|%-30s|%-8s|%-5s\n", "Student ID", "Student Name", "Birth Year", " Class");
        for (Student std : studentList) {
            std.print();
        }
    }

}
