package OOPS.MultipleInheritanceUsingInterfaces;



public class Person implements LiveLife, WorkHard {


    @Override
    public void liveLife() {
        System.out.println("Live Life Happily");
    }

    @Override
    public void workHard() {
        System.out.println("Work Hard to acheive great");
    }

    @Override
    public String toString() {
        return "Person{}";
    }
}
