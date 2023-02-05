package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowAndThrows {
    public static void main(String args[]){
        try{
            //anotherMethod();
            someMethod();
        }catch (Exception e){
            System.out.println("File Not Found Exception");
        }

    }
    public static void anotherMethod() throws Exception{
        /*
         First we will try to understand the throws keyword by reading a file which throws FileNotFoundException.
         Throws will be used along with method. If we dont want to handle the exception using try catch block in the method
         we will make the method to throw the exception. Whoever invoked this method will have to handle the exception using try
         catch block
         */
        /*
        The below line throws FileNotFoundException. So we are making the method to handle the exception by
        adding throws Exception at the end.
        So in the main()  when we are invoking anotherMethod() we need to handle the exception thrown by anotherMethod()
         */
        FileReader fr = new FileReader("file.txt");

    }

    public static void someMethod() throws FileNotFoundException{
        /*
           In this method we will try to understand how throw keyword works. Using throw keyword we are explicitly throwing the
           exception.
         */
        throw new FileNotFoundException();
    }
}
