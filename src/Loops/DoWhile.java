package Loops;

public class DoWhile {
    public static void main(String []args){
        // do while loop
        // its another kind of loop where all the statements in the do block will execute atleast once even the condition is false
        int i =0;
        do{
            System.out.println(i);
            i++;
        } while(i<10);

        // Using multiple values
        int k=11, l=11;
        do{
            System.out.println("k = "+ k + "and l = " + l);
        } while(k<=10 && l<=10);
    }
}
