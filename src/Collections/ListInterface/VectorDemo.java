package Collections.ListInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class VectorDemo {
    public static void main(String args[]){

        /*
        Vector: Vector is a class which implements the List interface. A vector object is an dynamic array where the elements are
                accessed with their indices. Difference between an ArrayList and Vector is Vectors are synchronised but ArrayList is
                unsynchronized.
         */

        // Initialising the vector in 3 ways

        // 1. Empty vector without giving size.
        Vector<Integer> vec = new Vector<Integer>();

        // 2. Vector with size
        Vector<String> strvec = new Vector<String>();

        // 3. Vector with collection
        Vector<Collection> collvec = new Vector<>(new ArrayList());

        // Methods:

        // 1. size(): This method returns the number of elements in the vector
        System.out.println("Size of the vector: "+" "+vec.size());

        // 2. add(Object): This method used to add the element at the end of  the vector.
        vec.add(1);
        vec.add(2);
        vec.add(5);
        vec.add(6);
        vec.add(10);
        System.out.println("Adding the element at the end of vector: "+" "+vec);

        // 3. add(int index, Object obj): This method is used to add an element at a specific index in the Vector.
        vec.add(2, 4);
        System.out.println("Adding the element at the particular index of the vector: "+" "+vec);

        // 4. set(int index, Object obj): This method is used to update the element at the particular index.
        vec.set(3, 15);
        System.out.println("Updating the element at the particular index: "+" "+vec);

        // 5. remove(int index): This method is used to remove the element at the particular index
        vec.remove(4);
        System.out.println("Removing the element at the particular index: "+" "+vec);

        // 6. remove(Object obj): This method used to remove the element specified.
        vec.remove(new Integer(10));
        System.out.println("Removing the element specified: "+" "+vec);


    }

}