package OOPS.AbstractClasses;

public abstract class Person {
    /*
       Abstract class: An Abstract class is a class with abstract keyword. It may have both abstract and non-abstract methods(methods with bodies).
       An abstract is a java modifier applicable for classes and methods in java but not for Variables.

       Basically Abstraction means hiding a particular process(method implementation) in a class and doing the process in another class.
       Its basically drawing away the process from a class.

       Q) When to use an interface vs abstract classes?

      A) The answer lies in the relationship of the classes. If the relationship is IS-A relationship we can use abstract classes.
         Else we make use of interfaces. The relationship bewteen the class and interface is CAN relationship.

      We can't instantiate the abstract class.

     */

    public void speak(){
        System.out.println("Shares his/her thoughts");
    }
    public abstract void eat();

}
