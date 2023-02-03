package UserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*

        Diff bwn next() and nextLine(): The next() method return the single word whereas nextLine() method returns the
        everything upto the next line break.

        For Example: If the following input: "Programmers love java" was passed from console
        next() --> returns Programmers
        nextLine() --> returns Programmers love java

         */
        System.out.println("Enter Full Name: "); // input: Dharmendra Makineni
        String name = sc.next(); // It prints Dharmendra only
        System.out.println(name);
        sc.nextLine();
        System.out.println("Enter Full Name: "); // input: Dharmendra Makineni
        String name1 = sc.nextLine(); // It prints Dharmendra Makineni
        System.out.println(name1);
        sc.close();
    }
}
