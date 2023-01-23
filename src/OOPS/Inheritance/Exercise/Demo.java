package OOPS.Inheritance.Exercise;

import OOPS.Inheritance.Exercise.ChildClasses.Crocodile;
import OOPS.Inheritance.Exercise.ChildClasses.EL;
import OOPS.Inheritance.Exercise.ChildClasses.Eagle;

public class Demo {
    public static void main(String []args){
        Crocodile croc = new Crocodile();
        croc.showInfo();

        System.out.println("----------------------------------------");

        EL el = new EL();
        el.showInfo();
        System.out.println("------------------------------------------");

        Eagle eagle = new Eagle();
        eagle.showInfo();


    }
}
