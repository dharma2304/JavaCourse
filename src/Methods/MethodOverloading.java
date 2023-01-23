package Methods;

public class MethodOverloading {
    public static void main(String [] args){
        /*
         Method Overloading: Method Overloading is the rewriting the method with same method name but with different signatures.
         Different signatures means different return types or different number of parameters or different return type of parameters
         */

        System.out.println(area(2.5d, 3.5d));
        System.out.println(area(2.5d));
        System.out.println(area(2));

    }

    // For this method area we have 2 parameters of type double with return type as double as well

    public static double area(double length, double width){
        return length*width;
    }


    // This is the same method as above but with only one parameter and return type as double
    public static double area(double length){
       return length*length;
    }


    // This is the same method as above but the return type of parameter is int and return type is double.
    public static int area(int length){
        return length;
    }
}
