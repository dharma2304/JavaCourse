package ExceptionHandling;

import java.util.Scanner;

public class TryCatchBasic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of i: ");
        int i= sc.nextInt();
        System.out.println("Enter the value of j: ");
        int j = sc.nextInt();
        //We are declaring an array of size 4.
        int a[] = new int[4];
        /*
          In the below statement we are dividing i by j whose value is zero which throws the exception.
          So we are going to put this above statement inside the try block
         */

        try{
            int k= i/j;
            System.out.println(k);
            // Inserting the values into the array.
            /*
            This will throws the exception since we are trying to insert the 5 values into the array.
            But the size of the array is 4.
             */
            for(int l=0;l<=4;l++){
                a[l]=l+1;
            }

        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception: We cannot divide the number by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: Input is more than array size");
        }

        // If we dont know what type of exception will encounter, we can add catch block with common Exception class at the end of all catch block which handles all of the exceptions
        catch(Exception e ){
            System.out.println("Unknown Exception");
        }

    }
}
