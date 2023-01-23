package OOPS.Inheritance;

public class HumanBeing {

    /*
     Understanding Inheritence: Basically inheritance is hierarchy between the classes by inheriting the properties of the classes.

     Lets understand with an example:

     Lets consider 2 entities --> Male and Female

     Listing the down the properties of male
     * eyes
     * nose
     * teeth
     * ears
     * hands
     * legs
     * hair
     * chest
     * penis
     * anus

     Listing down the properties of female

     * eyes
     * nose
     * teeth
     * ears
     * hands
     * legs
     * hair
     * breasts
     * Vagina
     * anus

     If we observe both male and female are human being. We can assume human being is the parent class and male and female are the
     child classes. And male and female classes has a IS-A relationship with human being.

     male is a human being
     female is a human being

     Male and Female classes have some common properties which every humanbeing can have. So we can move the common
     properties to human being class and child classes inherit from the human being class

     So the properties which goes to human being class are

      * eyes
     * nose
     * teeth
     * ears
     * hands
     * legs
     * hair
     * anus

     And in Male class we define only 2 properties
     * chest
     * penis

     And in Female class we define only 2 properties
     * breasts
     * vagina


     Types of Inheritance in Java

     1. Single Inheritance

        Class A -> class B

        There are only two classes. one is parent class and other one is subclass which inherits the parent class.

     2. Multiple Inheritance: Multiple Inheritance is not allowed in java

                class A          class B

                          class C
             When the class C inherits both the classes then if we have any methods or properties with the same name
             java compiler will confuse which one to consider. it creates ambiguity
    3. Multi Level Inheritance

        Class A -> Class B -> Class C

        Here Class A is the parent class of Class B and the Class B is the parent class of Class C.

   4. Hierarchical Inheritance:

                          class A

                     Class B   class C     class D
        In this we have only one parent class and all the other subclasses inherit that parent class.


     */




    /*
    If we have declared any properties as private then they will not be inherited in the child classes.
    In this case we can do this using constructors. We will initialise the values using constructors and get the values using getters
     */


    private String eyes;
    private String nose;
    private String teeth;
    private String ears;
    private String hands;
    private String legs;
    private String hair;
    private String anus;

    public HumanBeing(){
        this.eyes = "eyes";
        this.nose = "nose";
        this.teeth = "teeth";
        this.ears = "ears";
        this.hands = "hands";
        this.legs = "legs";
        this.hair = "hair";
        this.anus = "anus";
    }

    public HumanBeing(String eyes, String nose, String teeth, String ears, String hands, String legs, String hair, String anus) {
        this.eyes = eyes;
        this.nose = nose;
        this.teeth = teeth;
        this.ears = ears;
        this.hands = hands;
        this.legs = legs;
        this.hair = hair;
        this.anus = anus;
    }

    public String getEyes() {
        return eyes;
    }

    public String getNose() {
        return nose;
    }

    public String getTeeth() {
        return teeth;
    }

    public String getEars() {
        return ears;
    }

    public String getHands() {
        return hands;
    }

    public String getLegs() {
        return legs;
    }

    public String getHair() {
        return hair;
    }

    public String getAnus() {
        return anus;
    }

    // And we can have custom methods in the class along with the properties
    public void describe(){
        System.out.println("I am human being");
    }
}
