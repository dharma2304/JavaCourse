package OOPS.StaticElements;

public class StaticElements {
    /*
       If any variable or method is static, it means they are independent of any object. They have only single copy
       in the memory. How many objects we create , once the static variable is updated ,it will have the updated value
       not the initial value.
       We need to access the static variables/methods with class name not with object of the class.

     */
     // We have declared a static variable val with value 0
    private static  int val = 0;

    // Generating the getters and setters for this variable.
    /*
      Getters and Setters method should be static because we cannot access the static variables in a
      non-static methods.
     */

    public static int getVal() {
        return val;
    }

    public static void setVal(int val) {
        StaticElements.val = val;
    }
}
