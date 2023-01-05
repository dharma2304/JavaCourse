package VariablesAndDatatypes;

import java.math.BigDecimal;

public class PrimitiveDataTypes {
    public static void main(String []args){

        /*
        Primitive Data types : byte, short, int, long, float, double, boolean, char

         */


        /*
          The maximum value of byte is +127
          The minimum value of byte is -128
         */
        // byte data type store the integer value of max 3 digits
        byte f = 110;

        // The maximum value of int datatype is 2147483647 and minimum value is -2147483648
        // int data type means its an integer and the value is whole number
        int value =12;

        System.out.println(value);
        /*
         There is another data type short which is used to store the smaller integer values.
         The maximum value of short is 32767
         The minimum value of short is -32768
         */
        short d = 345;


        /*
          There is another datatype long which stores integer values only but huge values
          The maximum value of Long  is 9223372036854775807
          The minimum value of long is  -9223372036854775808
         */

        // need to add L at the end of the value to indicate java that its a long value
        long max = 7890654321098L;



        // Floating point numbers

        // float datatype stores the values with decimals. We need to add f at the end of the value.
        float fl = 456.8f;

        // double datatype stores the values with decimals of higher precision . We need to add d at the end of value.
        double db = 566.890;


        // boolean datatype is used to store the values true or false
        boolean v1 = true;
        boolean v2 = false;

        // char datatype is used to store the single character value like a or b or $

        char c1 = 'a';
        char c2='&';

        // If we want to print the special character , we have unicode value for each character in a unicode table which are available on internet
        char c3 = '\u1590';
        System.out.println(c3);



        double d1 = 123455.677889898;
        BigDecimal bd= new BigDecimal(String.valueOf(d1));
        System.out.println(bd.add(bd));

    }
}
