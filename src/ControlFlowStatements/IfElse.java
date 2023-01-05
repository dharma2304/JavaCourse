package ControlFlowStatements;

public class IfElse {
    public static void main(String [] args){
        // if  else block

        int x =10;

        /*
         The curly braces after the if() is the scope of the statements inside the if block.
         If we have only one statement we don't need of curly braces and the statement after it only will execute.
         else block works similar to if block.
         */
        //        if(x>5)
       //            System.out.println(x);

        if(x >5){
            System.out.println(x+5);
        } else{
            System.out.println(x-5);
        }

        // nested if else
        if(x==10){
            System.out.println("x is equal to 10");
        } else if(x >10){
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is less than 10");
        }


    }
}
