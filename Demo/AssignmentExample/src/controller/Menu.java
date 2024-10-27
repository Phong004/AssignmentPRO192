package controller;

import java.util.ArrayList;


public class Menu<E> {
    public static void showMenu(){
        System.out.println("");
        System.out.println("      **********************************************************");
        System.out.println("      *        WELCOME TO OPTIONS WITH MANAGING STUDENT        *");
        System.out.println("      **********************************************************");
        System.out.println("      *        1. Add a Student                                *");
        System.out.println("      *        2. Seach a Student by name                      *");
        System.out.println("      *        3. Remove a Student by ID                       *");
        System.out.println("      *        4. Print the Student list                       *");
        System.out.println("      *        5. Save to file.                                *");
        System.out.println("      *        6. Quit                                         *");
        System.out.println("      **********************************************************");
        System.out.println("      **(Note: Your options from 1 - 6)");
        System.out.print((char)27 + "[30m");
    }
    
    public static void addStudent() {
        System.out.println("");
        System.out.println("       ---------------------------------------------------------");
        System.out.println("      |               ADD THE INFORMATION OF STUDENT            |");
        System.out.println("      |---------------------------------------------------------|");
        System.out.println("      |               1. Add Student                            |");         
        System.out.println("      |               2. Exit                                   |");
        System.out.println("       ---------------------------------------------------------");
        System.out.println("\n      **(Note: Your options from 1 - 2)");
        
    }
    
    public static void searchStudent() {
        System.out.println("");
        System.out.println("       -------------------------------------------------------");
        System.out.println("      |             ADD THE INFORMATION OF STUDENT            |");
        System.out.println("      |-------------------------------------------------------|");
        System.out.println("      |               1. Search Student with name             |");  
        System.out.println("      |               2. Exit                                 |");
        System.out.println("       -------------------------------------------------------");
        System.out.println("\n      **(Note: Your options from 1 - 2)");
        
    }
       
    public static void removeMenu() {
        System.out.println("");
        System.out.println("       ---------------------------------------------------------");
        System.out.println("      |            REMOVE THE INFORMATION OF STUDENT            |");
        System.out.println("      |---------------------------------------------------------|");
        System.out.println("      |               1. Remove Student                         |");         
        System.out.println("      |               2. Exit                                   |");
        System.out.println("       ---------------------------------------------------------");
        System.out.println("\n      **(Note: Your options from 1 - 2)");
        
    }
    
   public int int_getChoice(ArrayList<E> options){
        return 1;
    }
    public E ref_getChoice(ArrayList<E> options){
        E result=null;
        
        return result;
    }
}
