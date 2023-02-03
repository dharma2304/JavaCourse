package OOPS.FinalKeyword;

public class Demo extends ParentClass {
    /*
       Final keyword: Final keyword can be used with variables, methods and classes.
       For Variables: If we have declared a variable as final, then we cannot change/re-assign the value to the variable.
       For Methods: If we we have declared a method as final, then we cannot override that method.
       For Classes: If we have declared a class a final, then that class cannot be extended by another class. It prohibits
                    the inheritance.
     */

    private final int x = 5;

    public Demo() {
    }

    /*
       So for a final variable we cannot create a setter method since setter methods alters the variable value.
       We can only able to create a getter method.
     */
    public int getX() {
        return x;
    }
}
