package Operators.ArithmeticOperators;

public class Operators {
    public static void main(String [] args){
        /*
           Firstly We will discuss about the Arithmetic operators
          1. + --> Addition
          2. - --> Subtraction
          3. * --> Multiplication
          4. / --> Division
          5. % --> Modulus
          6. ++ --> Increment
          7. -- --> Decrement
         */

        int value =5;
        int minus = 2;

        // + --> to add two entities incase of  addition and concatenate entities incase of strings
        System.out.println(value+minus);
        System.out.println("Hello" + "World");

        // - --> subtraction just subtracts the values
        System.out.println(minus-value);

        // * --> multiplication
        System.out.println(value*minus);

        // / --> division returns the quotient only
        System.out.println(value/minus);

        // % --. modulus operator returns the remainder
        System.out.println(value%minus);

        // ++ --> increment operator. there are 2 ways which are pre-increment and post-increment
        System.out.println(value++); // it will not increase the value at this statement and will increase after state got executed
        System.out.println(value);
        System.out.println(++value);

        // -- --> same with the case of decrement
        System.out.println(value--);
        System.out.println(value);
        System.out.println(--value);
    }
}
