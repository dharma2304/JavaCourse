package Loops;

public class NestedLoopsExercise {
    public static void main(String []args){
        /*
         Exercise : print the pattern
            @
            @@
            @@@
            @@@@
            @@@@@
         */
        for(int i=0; i<=4;i++){
            for(int j=0; j<=i; j++){
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}
