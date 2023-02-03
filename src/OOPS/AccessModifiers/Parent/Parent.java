package OOPS.AccessModifiers.Parent;

public class Parent {
    // lets declare a private variable which is accessible within this class only.
    private int x =10;

    /*
      This public method is available all over the OOPS.AccessModifiers package.
     */
    public void demo(){
        System.out.println("Demo method");
    }

    // This is a default variable which is accessible only within this package.
    int y=10;

    /*
    This method will be acessible within this package and outside of the package through inheritence. It means this
    method is accessible in Parent package and also in AccessModifiers, Child packages if any of the classes in those packages
    extends the class Parent.Lets check in the child package.
     */
    protected void demo1(){
        System.out.println("This is a protected method");
    }
}
