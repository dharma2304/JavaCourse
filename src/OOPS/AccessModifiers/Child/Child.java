package OOPS.AccessModifiers.Child;

import OOPS.AccessModifiers.Parent.Parent;

public class Child extends Parent {
     /*
     We have a protected method in the class Parent which we can access in this child class
     since we inherited the class Parent
      */
    public void printDemo1(){
        this.demo1();
    }
}
