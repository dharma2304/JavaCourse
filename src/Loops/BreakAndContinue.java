package Loops;

public class BreakAndContinue {
    public static void main(String []args){
        // Break statement terminates the loop
        for(int i=0; i<=10; i++){
            System.out.println(i);
            // When the value of i is greater than 5 the for loop will get terminated.
            if(i>5) break;
        }

        // continue : continue statement just escapes the specific iteration.
        for(int i=0; i<10;i++){
            // when i=5 the iteration is escaped and i is incremented to 6
            if(i==5)  continue;
            System.out.println(i);
        }
}
}