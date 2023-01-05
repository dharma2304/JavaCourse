package ControlFlowStatements;

import java.util.Locale;

public class SwitchStatement {
    public static void main(String[] args){
        /*
         Switch statement: Basically its an alternative of if else block
         Any switch case can be written as if-else statement but not all if-else statements can be written as switch statement
         */

        int x =1;

        // Actually the sequence of cases doesnt matter but we must add break statement at the end of each case
        // We can  apply code block {} for each case but its optional.
        switch (x){
            case 1:
                System.out.println("x is equal to 1");
                break; // When the x is 1 means it will come to this case and print the message and stop the execution of switch statement
            case 2:
                System.out.println("x is equal to 2");
                break; //When the x is 2 means it will come to this case and print the message and stop the execution of switch statement
            case 3:
                System.out.println("x is equal to 3");
                break; // When the x is 1 means it will come to this case and print the message and stop the execution of switch statement
            default:
                System.out.println("x is other than 1, 2 ,3");
                break;
        }

        char c = 'B';

        switch(c){
            case 'p':
                System.out.println("The value of c is p");
                break;
            case 'q':
                System.out.println("The value of c is q");
                break;
            case 'r':
                System.out.println("The value of c is r");
                break;
            default:
                System.out.println("The value of c is other than p, q ,r");
                break;

        }

        String name = "Makineni";
        // convert the string to lowercase: name.toLowerCase() returns the string in lowercase letters.
        // convert the string to uppercase: name.toUpperCase() returns the string in uppercase letters.
        // If the input string is case-sensitive just convert the string to lower case and write the cases of switch statement in lowecase as well.
        switch(name.toLowerCase()){
            case "dharmendra":
                System.out.println("Name is dharmendra");
                break;
            case "chintu":
                System.out.println("Name is Chintu");
                break;
            case "makineni":
                System.out.println("Name is Makineni");
                break;
            default:
                System.out.println("Name is other than Makineni");
                break;
        }
    }
}
