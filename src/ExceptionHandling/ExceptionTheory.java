package ExceptionHandling;

public class ExceptionTheory {
    /*
      Exception: Exception is generally an interruption of running program.
      We have a hierarchy for the Exception.

               Throwable(Class) : Super Class
                     - Exception(Class): Can be handled
                              - Checked Exceptions: Compile time exceptions
                                        - IO Exception
                                        - SQL Exception
                              - UnChecked Exceptions: Run-time exceptions
                                        - ArrayIndexOutOfBounds Exception
                                        - FileNotFound Exception

                     - Error(class): Can't be handled



      When we need to use exception: When we find the statements in the code might cause some issues then we need to
                                     need to use exception for those statments.

      We use try - catch blocks to handle the exceptions

      We include the statements that we think might cause exception in a try block: try{}

      The try{} block throws the object of exception which will be handled in the catch(){} block

     Note: A try{} block can throw only one exception. If we have statements which throws multiple kinds of exceptions,
          then try block immediately jumps into the catch block when it encounters the first exception.

     */
}
