package OOPS.Encapsulation;

public class Demo {
    public static void main(String []args){

        Person person = new Person("Dharmendra",24, "Makineni");

        // We have instantiated the Person class and we can change the values of properties of Person class since they are public

        /*
         I have changed the value by assigning -10 to it.
         But this is not the correct way to set the value to the property. It disrupts the privacy of properties in the Person class
         We have setters to set the value for the properties.
         */

        System.out.println(person);


    }
}
