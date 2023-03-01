package Generics;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
    private int vechicleId;

    public Vehicle(int vechicleId) {
        this.vechicleId = vechicleId;
    }

    public int getVechicleId() {
        return vechicleId;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vechicleId=" + vechicleId +
                '}';
    }
}

class Car extends Vehicle{
    private String carModel;

    public Car(int vechicleId, String carModel) {
        super(vechicleId);
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                '}';
    }
}
public class WildCardGenerics {
    public static void main(String args[]){

        /*

          Wild Card: In Generics the wild card is '?'. In some cases we don't know what is the type parameter that
          will come to generic method or class.We can use wild cards in those cases.

          In our case display() method accepts list as parameter. But the type parameter can be vehicle or car . We can
          use wild card as type parameter and set the bound to the type parameter.


         */


       List <Vehicle> list = new ArrayList<Vehicle>();
        list.add(new Vehicle(1));
        list.add(new Vehicle(2));
        list.add(new Vehicle(3));
        list.add(new Vehicle(4));
        list.add(new Car(5, "TATA NANO"));
        display(list);
    }

    //  If we have a vechicle as bounded type parameter then list parameter in the display method accepts Vehicle class and subclasses of vehicle.

    public static void display(List<?>list){
        for(Object ele : list){
            System.out.println(ele);
        }
    }


}
