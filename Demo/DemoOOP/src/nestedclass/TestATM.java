package nestedclass;

/**
 * Define the TestATM class
 *
 */
public class TestATM {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 1) { // verifying number of command line arguments
            // Instantiate the outer class
            AtmMachine objAtm = new AtmMachine();
            // Invoke the static nested class method using outer class object
            AtmMachine.BankDetails.printDetails();
            // Invoke the instance method of outer class
            objAtm.displayBalance(args[0]);
        } else {
            System.out.println("Usage: java AtmMachine <account-no>");
        }
    }
}