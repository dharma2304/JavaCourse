package OOPS;

public class ClassesAndObjects {
    /*

     In a real time scenario, we can assume the object is like a human being, car , any substance.
     For example : Let's consider the object car.

      Car has many properties like steering, doors, brakes, accelarator, tyres etc
      and functionalities/ behaviour like increasing the accelarator, applying the brakes, starting the engine etc

      All these properties and functionalities/behaviour is mentioned in the class. Class is like customized plan of the object.

     */
    public static void main(String [] args){

        /*
         In the below object creation or instantiating the class , the default constructor will be called when no explicit constructor
         has been written in the Car class. If we have any constructor written in the class the below object creation will throw the error.
         */
        Car car = new Car();


        // We need to call setDoors() method before getDoors() method to be called.
        // see here we are calling getDoors() method in the Car class which returns doors value which is not set yet. So It returns default value null.
//        System.out.println(car.getDoors());
//
//
//        car.setDoors("closed");
//        System.out.println(car.getDoors());
//
//        car.setEngine("off");
//        car.setSpeed(30);
        System.out.println(car.run());

        // if we have a constructor which initialised the properties , we do not need to call the setters before the run method.
        // The best way to set the properties in the class are intialising them in the constructors
        Car car1 = new Car("closed", "on", 30);
        System.out.println(car1.getSpeed());
        System.out.println(car1.run());

    }
}
