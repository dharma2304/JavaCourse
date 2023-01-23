package OOPS.Inheritance.Exercise.ChildClasses;

import OOPS.Inheritance.Exercise.IntermediateClasses.Reptile;

public class Crocodile extends Reptile {

    private String hardShelledEggs;


    public Crocodile(){
        super();
        this.hardShelledEggs="hard";
    }

    public Crocodile(int height, double weight, String animalType, String bloodType, String skin, String backbone, String softShelledEggs, String hardShelledEggs) {
        super(height, weight, animalType, bloodType, skin, backbone, softShelledEggs);
        this.hardShelledEggs = hardShelledEggs;
    }

    public String getHardShelledEggs() {
        return hardShelledEggs;
    }

    public void showInfo(){
        System.out.println(
                 " Height = " + this.getHeight() +
                 " Weight = "  + this.getWeight() +
                 " AnimalType = " + this.getAnimalType() +
                 " BloodType = " + this.getBloodType() +
                 " Skin = " + this.getSkin() +
                 " Backbone = " + this.getBackbone() +
                 " SoftShelledEggs = " + this.getSoftShelledEggs() +
                 " HardShelledEggs = " + this.getHardShelledEggs()
        );
    }



}
