package nestedclass;

public class Authenticate {
    /**
     * Define an anonymous class
     */
    Account objAcc = new Account() {
        /**
         * Displays balance
         *
         * @param accNo a String variable storing balance
         * @return void
         */
        @Override
        public void displayBalance(String accNo) {
            System.out.println("Retrieving balance. Please wait...");

            // Assume that the server returns 40000
            System.out.println("Balance of account number " + accNo.toUpperCase()
                    + " is $40000 ");
        }
    }; // End of anonymous class

    /**
     * Define the Account class
     */
    class Account {
        /**
         * Displays balance
         *
         * @param accNo a String variable storing balance
         * @return void
         */
        public void displayBalance(String accNo) {
        }
    }
}


