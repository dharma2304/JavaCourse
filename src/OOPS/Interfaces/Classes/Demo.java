package OOPS.Interfaces.Classes;

public class Demo {
    public static void main(String args[]){
        Car car = new Car(30,4);
        car.increaseSpeed(car.getSpeed());
        car.changeGear(car.getGearNumber());
        car.applyBrakes(30);

        Bike bike = new Bike(30, 4);
        bike.increaseSpeed(car.getSpeed());
        bike.changeGear(car.getGearNumber());
        bike.applyBrakes(30);

    }
}
