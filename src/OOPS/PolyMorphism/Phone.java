package OOPS.PolyMorphism;

public class Phone {
   /*
    The word polymorphism means having many forms.
    In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form.

     PolyMorphism is classified as two types
     1. Compile time polymorphism
     2. Runtime polymorphism

     Compile time polymorphism: Its a static polymorphism which can be achevied by function overloading.
                                Basically its method overloading.
     Runtime Polymorphism: Its is acheived by function overriding.
    */
    private String model;

    public String getModel() {
        return model;
    }

    public Phone(String model) {
        this.model = model;
    }

    public void features(){
        System.out.println("Feature Phone: "+ model);
    }

}
