/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SE162033 Nguyen Vuong Bach
 */
public class SavingAccount {

    private String accountID;
    private int balance;

    public SavingAccount(String accountID, int balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

    public boolean savingWithdraw(int money) {
        if (money > 0 && money < this.balance) {
            this.balance = this.balance - money;
            return true;
        } else {
            return false;
        }
    }

    public int getMoney() {
        return balance;
    }

    public boolean savingDeposit(int money) {
        if (money > 0) {
            this.balance += money;
            return true;
        } else {
            return false;
        }
    }
}
