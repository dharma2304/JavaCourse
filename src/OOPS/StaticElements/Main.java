package OOPS.StaticElements;

public class Main {
    public static void main(String args[]){
        // We dont need to create the object for StaticElements class to access the static variable.
        // We can access directly with the class name.

        System.out.println(StaticElements.getVal());
        StaticElements.setVal(25);
        System.out.println(StaticElements.getVal());

    }
}
