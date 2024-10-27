
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter owner:");
        final String name = sc.nextLine();
        System.out.print("Enter price:");
        final int price = sc.nextInt();
        System.out.print("Enter color:");
        final int color = sc.nextInt();
        System.out.println("1.Test toString()");
        System.out.println("2.Test setData()");
        System.out.println("3.Test getValue()");
        System.out.print("Enter TC(1,2,3):");
        final int c = sc.nextInt();
        final Cala obj1 = new Cala(name, price);
        final SpecCala obj2 = new SpecCala(color, name, price);
        switch (c) {
            case 1: {
                System.out.println("OUTPUT:");
                System.out.println(obj1.toString());
                System.out.println(obj2.toString());
                break;
            }
            case 2: {
                System.out.println("OUTPUT:");
                obj2.setData();
                System.out.println(obj2.getOwner() + "," + obj2.getPrice());
                break;
            }
            case 3: {
                System.out.println("OUTPUT:");
                System.out.println(obj2.getValue());
                break;
            }
        }
    }
}
