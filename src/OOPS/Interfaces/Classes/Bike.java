package OOPS.Interfaces.Classes;

import OOPS.Interfaces.Vehicle;

public class Bike implements Vehicle {
    private int speed;
    private int gearNumber;

    public Bike(int speed, int gearNumber) {
        this.speed = speed;
        this.gearNumber = gearNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGearNumber() {
        return gearNumber;
    }

    @Override
    public void increaseSpeed(int spd) {
        speed = speed+spd;
        System.out.println("The Speed has been increased by: "+speed);
    }

    @Override
    public void changeGear(int num) {
        gearNumber = num;
        System.out.println("The gear changed to  number:"+ gearNumber);
    }

    @Override
    public void applyBrakes(int spd) {
        speed = speed - spd;
        System.out.println("Brakes are applied. So the new speed is: "+speed);
    }
}
