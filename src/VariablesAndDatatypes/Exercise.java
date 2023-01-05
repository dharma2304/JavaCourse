package VariablesAndDatatypes;

public class Exercise {
    public static void main(String [] args){
        // (a+b)^2 = a^2 + 2ab+ b^2;
        int a = 20;
        float b = 10.567f;
        int value = (int)(a*a + 2*a*b + b*b);
        System.out.println(value);
    }
}
