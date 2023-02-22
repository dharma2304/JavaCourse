package Collections.ListInterface;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String args[]){

        /*
        ArrayList: ArrayList class implements the List interface. The objects of this class are dynamic arrays.
                   For Example if we have created an arraylist with specified size , and we want to add more elements than
                   the specified size then we can add the elements and arraylist adjusts its size dynamically. It allows duplicate elements
                   An ArrayList is unsynchronised, which means multiple threads can access them at the same time.
                   A thread is a unit of sequential flow control that can be processed in the Operating System.
         */

        // Intialising the arraylist
        ArrayList<Integer> intArrli = new ArrayList<>();

        // Methods:

        // 1. size(): get the length of arraylist using size()
        System.out.println("size of arraylist: "+" "+intArrli.size());

        // 2. add(value): adding the elements using add()
        intArrli.add(1);
        intArrli.add(2);
        intArrli.add(3);
        intArrli.add(9);
        intArrli.add(10);
        System.out.println("Adding the elements to the arraylist: "+" "+intArrli);

        // 3. add(int index, Object obj): This method used to add the element at specific index
        intArrli.add(5, 50);
        System.out.println("Adding the element at the particular index: "+ " "+ intArrli);

        // 4. remove(int i):removes the elements at the particular index
        intArrli.remove(4);
        System.out.println("Removes the element at the particular index: "+" "+intArrli);

        // 5. remove(Object obj): This method removes the element specified in the arraylist
        intArrli.remove(new Integer(50));
        System.out.println("Removes the particular element specified in the arraylist: "+" "+intArrli);

        // 6. set(int index, Object obj): This method used to set the element at a particular index
        intArrli.set(3, 90);
        System.out.println("Setting the element at the particular index: "+" "+intArrli);

        // 7. get(int index): This method used to return the element at the particular index.
        System.out.println("Get the element at the  index 2: "+" "+intArrli.get(2));


    }
}
