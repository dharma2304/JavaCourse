package OOPS.AccessModifiers;

import OOPS.AccessModifiers.Child.Child;
import OOPS.AccessModifiers.Parent.Parent;

public class App {
    public static void main(String args[]){
       Parent p = new Parent();
       p.demo();

       Child c = new Child();
       c.printDemo1();
    }
}
