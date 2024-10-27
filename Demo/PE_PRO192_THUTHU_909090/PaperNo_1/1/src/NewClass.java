
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nguye
 */
public class NewClass {

    public static void main(final String[] args) {
        int money = 0;
        boolean rs = false;
        SavingAccount acc = null;
        final String accountID = "test123";
        final int balance = 100;
        final Scanner sc = new Scanner(System.in);
        acc = new SavingAccount(accountID, balance);
        System.out.println("1. Test savingWithdraw()");
        System.out.println("2. Test savingDeposit()");
        System.out.print("Enter option (1 or 2):");
        final int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.print("input money:");
                money = sc.nextInt();
                rs = acc.savingWithdraw(money);
                if (!rs) {
                    System.out.println("OUTPUT:");
                    System.out.println("false");
                    break;
                }
                System.out.println("OUTPUT:");
                System.out.println(acc.getMoney());
                break;
            }
            case 2: {
                System.out.print("input money:");
                money = sc.nextInt();
                rs = acc.savingDeposit(money);
                if (!rs) {
                    System.out.println("OUTPUT:");
                    System.out.println("false");
                    break;
                }
                System.out.println("OUTPUT:");
                System.out.println(acc.getMoney());
                break;
            }
        }
    }
}
