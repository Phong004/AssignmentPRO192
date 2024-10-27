package view;

import controller.Menu;
import controller.StudentController;
import utilities.Validation;

public class Main {

    public static void main(String[] args) {
        try {
            StudentController studentControl = new StudentController();
            int choice;
            do {
                Menu.showMenu();
                choice = Validation.checkInt("Please enter your choice: ", 6);

                switch (choice) {

                    case 1: {
                        int addChoice;
                        do {
                            Menu.addStudent();
                            addChoice = Validation.checkInt("Please enter your choice: ", 2);

                            switch (addChoice) {
                                case 1:
                                    studentControl.addStudent();
                                    break;
                            }
                        } while (addChoice == 1);
                        break;
                    }

                    case 2: {
                        int findChoice;
                        do {
                            Menu.searchStudent();
                            findChoice = Validation.checkInt("Please enter your choice: ", 2);

                            switch (findChoice) {

                                case 1:
                                    studentControl.searchStudentByName();
                                    break;
                            }
                        } while (findChoice == 1);
                        break;
                    }

                    case 3: {
                        int removeChoice;
                        do {
                            Menu.removeMenu();
                            removeChoice = Validation.checkInt("Please enter your choice: ", 2);

                            switch (removeChoice) {
                                case 1:
                                    studentControl.deleteStudent();
                                    break;
                            }
                        } while (removeChoice == 1);
                        break;
                    }

                    case 4:
                        studentControl.printStudent();
                        break;
                    case 5:
                        studentControl.saveStudent();
                        break;
                    case 6: {
                        System.out.println("\n                            PROCESS ✼ END                           \n");
                        break;
                    }
                }
            } while (choice < 6);
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
    }
}
