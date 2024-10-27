package inheritance;

public class MainMenu {

    public static void main(String[] args) {

        String[] menu = {" Test Circle",
            " Test HinhTru",
            " Update name and mark of a student based on his/her code",
            " Remove a student based on his/her code",
            " List all students"};
        int choice = 0;
        do {
            choice = Menu.getChoice(menu);
            switch (choice) {
                case 1:
                    Circle c = new Circle(10);
                    System.out.println(c.toString());
                    System.out.println(c.getCircumference());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Good bye!");
            }
        } while ((choice > 0) && (choice < menu.length + 1));

    }

}
