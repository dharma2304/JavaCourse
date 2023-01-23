package OOPS.Inheritance;

public class Demo {

    public static void main(String[] args){
       Male male = new Male("chest", "penis");
        System.out.println(male.getEars());

        // When we try to print the object directly , the toString() method of the object will be called by default.
        // So we can override this method in the class Male

        System.out.println(male);

        //Here We can assign the object of parent class(Human Being) or object of subclasses of parent classes(Male or Female) to variable of type parent class(Human being)
        HumanBeing male1 = new Male();
        male1.describe();
    }
}
