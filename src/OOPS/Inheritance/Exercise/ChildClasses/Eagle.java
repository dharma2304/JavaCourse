package OOPS.Inheritance.Exercise.ChildClasses;

import OOPS.Inheritance.Exercise.IntermediateClasses.Birds;

public class Eagle extends Birds {

    public Eagle(){
        super();
    }

    public Eagle(int height, double weight, String animalType, String bloodType, boolean withFeathers, boolean canFly) {
        super(height, weight, animalType, bloodType, withFeathers, canFly);
    }

    public void showInfo(){
        System.out.println(
                " Height = " + this.getHeight() +
                        " Weight = "  + this.getWeight() +
                        " AnimalType = " + this.getAnimalType() +
                        " BloodType = " + this.getBloodType() +
                        " WithFeathers = " + this.isWithFeathers() +
                        " HasGills = " + this.isCanFly()
        );
    }
}
