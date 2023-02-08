package Arrays;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String args[]){
        /*
           Multi-dimensional Arrays: Multi-dimensional Arrays are the array of arrays.
         */

        // Initialising the multi-dimensional array with 2 rows and 2 columns
        int arr[][] = new int [2][2];


        for(int r=0; r<2; r++){
            for(int c=0; c<2; c++){
                arr[r][c]=c+1;
            }
        }

       for(int r=0; r<2; r++){
           for(int c=0; c<2;c++){
               System.out.print(arr[r][c]+" ");
           }
           System.out.println();
       }




    }
}
