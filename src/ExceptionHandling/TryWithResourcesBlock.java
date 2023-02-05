package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResourcesBlock {
    public static void main(String args[]) {
        /*
          Generally we use the finally block to close the resources. But using Try with resources block we dont need to have the
          finally block just to close the resources.
          Try with resources was introduced in Java 1.7
         */
        // creating the resource buffered reader to read the input integer
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
         When writing Try with resource we need to create the resource along with the try block by passing the resource as
         argument for try() .

        we will pass "BufferedReader br = new BufferedReader(new InputStreamReader(System.in))"  this entire statement in the
        try() as argument so that at the end of the program the resource will automatically close.
        Its the job of the try() to close the resource once the we read the input.
         */
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the String");
            int str = Integer.parseInt(br.readLine());
            System.out.println(str);
        }
        catch(Exception e){
            System.out.println("Unknown Exception");
        }
    }
}
