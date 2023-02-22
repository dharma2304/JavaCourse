package Collections.ListInterface;

import java.util.Stack;

public class StackDemo {
    public static void main(String args[]){

        /*
        Stack: It a class which extends the vector class . The basic principle of stack is LIFO(Last-In-First-Out).
               This stack class implements the five operations which are push, pop, peek, empty, search.This stack
               class is the subclass of vector class.
         */

        // Initialise an empty stack
        Stack<Integer> strStack = new Stack<Integer>();

        // Implement the operations.

        // 1. push(): This method will push the elements to stack.
        for(int i=10;i<=15;i++){
            strStack.push(i);
        }
        System.out.println("Pushing the elements into the stack: "+" "+strStack);

        // 2. pop(): This method will pop the last pushed element into the stack.
        strStack.pop();
        System.out.println("Popping the element from the stack: "+" "+strStack);

        // 3. peek(): This method is used to retreive the element present at the top of the stack
        System.out.println("Retreiving the element at the top of the stack: "+" "+(Integer)strStack.peek());

        // 4. Search(): This method is used to search an element present in the stack. It returns the index of element if found. Else returns -1
        int pos = (Integer) strStack.search(11);
        if(pos != -1){
            System.out.println("Element found at position: "+ pos);
        } else{
            System.out.println("Element not found");
        }

        // 5. empty(): This method returns true if atleast one element is present in the stack. Else false.
        System.out.println("Checking whether the stack is empty or not: "+ strStack.empty());
    }
}