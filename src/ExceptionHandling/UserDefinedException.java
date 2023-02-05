package ExceptionHandling;

//User defined exception class
class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}

public class UserDefinedException {
    public static void main(String args[]){
        /*

        User Defined Exception: We can create our own exceptions which are basically derived classes of exception.
             Creating our own exceptions is called custom exception or user defined exception.
             Basically, Java custom exceptions are used to customize the exception according to user needs.
         In layman terms , User defined exception is creating our own exception class and throwing that exception using the
         throw keyword.

         */
        try{
            throw new   MyException("Dharmendra");
        } catch(MyException e){
            System.out.println(e.getMessage());
        }

    }
}
