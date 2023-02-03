package Scope;

public class Scope {
    /*
     Scope: Scope of a variable or a method is access level of them restricted to a particular code block.
     */
    public static void main(String args[]){
        /*
         lets understand with the for loop.

          We have initialised a variable i in the for loop and we have iterated the variable printing its value at
          each iteration.
          But if you want to access the variable outside of forloop it throws an error. Since the variable 'i' is restricted to this for loop itself.
         */

        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
