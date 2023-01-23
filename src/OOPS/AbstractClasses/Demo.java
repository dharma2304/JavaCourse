package OOPS.AbstractClasses;

public class Demo {
    public static void main(String args[]){
       Person john = new Vegan();
       john.speak();
       john.eat();
       System.out.println("-------------------------------");
       Person jenny = new NonVegan();
       jenny.speak();
       jenny.eat();

    }
}
