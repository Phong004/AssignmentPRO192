package nestedclass;

/**
 * Define the TestAuthentication class
 *
 */
public class TestAuthentication {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instantiate the Authenticate class
        Authenticate objUser = new Authenticate();
        // Check the number of command line arguments
        if (args.length == 3) {
            if (args[0].equals("admin") && args[1].equals("abc@123")) {
                // Invoke the displayBalance() method
                objUser.objAcc.displayBalance(args[2]);
            } else {
                System.out.println("Unauthorized user");
            }
        } else {
            System.out.println("Usage: java Authenticate <user-name> <password> <account-no>");
        }
    }
}