package ExceptionHandling;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String args[]){
        /*
          Finally Block: Finally block is the block of code in any case, either in case of exception or incase of no
          exception. We need to add the finally block at the end of all the catch blocks so that it will execute that
          block at last.
          Finally block is useful when you want to close the resource before completing the execution of program like
          Scanner ,BufferedReader.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number i: ");
        int i = sc.nextInt();
        System.out.println("Enter a number j: ");
        int j = sc.nextInt();

        try{
            int k = i/j;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            //System.out.println("Arithmetic Exception: Can't divide by number zero");
        }
        finally{
            sc.close();
            System.out.println("Completed the execution, BYE");
        }

    }
}
