package Loops;

public class ForEachLoop {
    public static void main(String args[]){
        /*
          For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5.

          Its generally used to traverse the arrays and collections

          Syntax:
          for(data-type arr: array-name){
             print(arr);
          }

         */
        int arr[] ={1,2,3,4,5,6};
        for(int a: arr){
            System.out.println(a);
        }
    }
}
