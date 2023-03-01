package Generics;

class Example<T>{
    T obj;

    public Example(T obj) {
        this.obj = obj;
    }

    public T myObj() {
        return obj;
    }
}



public class Generics {

    public static void main(String args[]){
        /*

        Generics: Generics are parameterized types. We can have parameterized types or type parameters for classes, interfaces
                  and methods. Parameterized types means passing the type as a parameter to class,interface, method which means
                  that class, interface and method accepts that type of data coming into them. The type should be always an object

       Types of Java Generics

       1. Generic Method: Generic Java method takes a parameter and returns some value after performing a task.
                         It is exactly like a normal function, however, a generic method has type parameters that are cited by actual type.
                         This allows the generic method to be used in a more general way. The compiler takes care of the type of safety which enables
                         programmers to code easily since they do not have to perform long, individual type castings.

      2. Generic Class: A generic class is implemented exactly like a non-generic class. The only difference is that it
                       contains a type parameter section. There can be more than one type of parameter, separated by a
                       comma. The classes, which accept one or more parameters are known as parameterized classes or parameterized types.

    Note: For Parmeter type we should not use primitive datatypes like int,char,float, boolean, etc. We should use reference types(Objects)
          for parameter type.

         */

        Example<Double> doex=new Example<Double>(23.455676);
        System.out.println(doex.myObj());

        Example<String> stex = new Example<String>("DHARMENDRA");
        System.out.println(stex.myObj());


    }
}
