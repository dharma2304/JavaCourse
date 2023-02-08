package Arrays;

public class Arrays {
    public static void main(String args[]){
        /*
           Arrays: Arrays are collection of elements of same data type stored in the memory.
           We can create an array of required data types we wish.
         */
        // How to initialise the array
        int arr[] = new int[10];
        //  OR
        int arr1[] ={1,2,3,4,5,6,7,8,9,10};


        // We can access the array elements through for loop or using index .
        // Length of array: arr.length is the property to get the length of the array
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }



    }
}
