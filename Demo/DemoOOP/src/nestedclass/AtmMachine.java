package nestedclass;

import java.util.Calendar;
public class AtmMachine {
    /**
     * Define the static nested class
     */
    static class BankDetails {
        // Instantiate the Calendar class of java.util package
        static Calendar objNow = Calendar.getInstance();

        /**
         * Displays the bank and transaction details
         *
         * @return void
         */
        public static void printDetails() {
            System.out.println("State Bank of America");
            System.out.println("Branch: New York");
            System.out.println("Code: K3983LKSIE");
            // retrieving current date and time using Calendar object
            System.out.println("Date-Time:" + objNow.getTime());
        }
    }

    /**
     * Displays balance
     *
     * @param accNo a String variable that stores the account number
     * @return void
     */
    public void displayBalance(String accNo) {
        // Assume that the server returns 200000
        System.out.println("Balance of account number " + accNo.toUpperCase() +
                " is $200000");
    }
}
