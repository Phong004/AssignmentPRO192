package viewer;

import controller.CompanyManagement;

public class Main {

    CompanyManagement cm = new CompanyManagement();

    public static void main(String[] args) throws Exception {
        // Menu options
        String[] options = {"Show the Employee list",
            "Add Employee", "Update Employee ",
            "Search Employee", "Save",
            "Sort Employees", "Exit"};
        Main main = new Main();

        int choice = 0;
        System.out.println(
                "Note: \nAll employee's salary based on the actual salary after multiply with the bonus and casted into integer!!!");
        do {
            System.out.println("\nCompany Employee Management Program");
            choice = Menu.getChoice(options); // show Menu options
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    System.out.println("Good bye!");
            }
        } while (choice > 0 && choice < options.length);
    }

}
