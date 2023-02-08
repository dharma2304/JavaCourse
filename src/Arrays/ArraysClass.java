package Arrays;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String args[]){
        /*
        The Arrays class in java.util package is a part of the Java Collection Framework.
        This class provides static methods to dynamically create and access Java arrays.
        It consists of only static methods and the methods of Object class. The methods of this class can be used by the class name itself.
         */

        int intArr[] = {1,2,3,4,5,6,7,8};
        int intArr1[] = {1,2,6,5};

        // 1. asList(arr[]) method

        System.out.println("Converting an array in to list:" + " "+ Arrays.asList(intArr));

        // 2. compare(arr1, arr2): It compares the 2 arrays lexicographically and returns -ve ,0 , +ve values.
        System.out.println("Comparing two arrays: " + " "+ Arrays.compare(intArr, intArr1));

        // 3. equals(arr1, arr2): checks all the elements are equal in the 2 arrays
        System.out.println("Checks all the elements in the 2 arrays: "+ " "+Arrays.equals(intArr, intArr1));

        // 4. fill(arr1, fillValue): Fill the same value for all the elements in the array.
        Arrays.fill(intArr, 1);
        System.out.println("Fill the same value for all the elements in the array: "+ " "+ Arrays.toString(intArr));

        // 5. sort(arr1): Sort the values in the array in the ascending order.
        Arrays.sort(intArr1);
        System.out.println("Sort the values in the array in the ascending order: "+" "+ Arrays.toString(intArr1));










    }
}
