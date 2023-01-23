package Methods;

public class Methodsjava {

    /*
         public : it is the access modifier
         void : return type of the method(it returns nothing)
         loop: name of the method
         initial_var and condition_value are parameters of return types integer

     */
    public static void loop(int initial_var, int condition_value) {
            while(initial_var <=condition_value){
                System.out.println(initial_var);
                initial_var ++;
            }
    }

    // This method returns the value of type double. So we need to capture/store the value when we invoke this method
    public static double areaOfRectangle(double length, double width){
         return length*width;
    }

    public static void main(String []args){
        // Methods are basically to reuse the code in the application. It preserves the DRY principle.
        /*
           It usually have parameters and return type and we write inside the block of the method
           We can call the methods  n number of times.
         */

        loop(1,10);
        System.out.println("*******************************************");
        loop(2, 20);

        //storing the value returning from the method
        double d = areaOfRectangle(90.8, 89.7);

        System.out.println(d);;
    }
}
