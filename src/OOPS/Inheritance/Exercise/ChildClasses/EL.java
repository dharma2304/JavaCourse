package OOPS.Inheritance.Exercise.ChildClasses;

import OOPS.Inheritance.Exercise.IntermediateClasses.Fish;

public class EL extends Fish {
    private String chargeRelease ;

    public EL(){
        super();
        this.chargeRelease="electric";
    }

    public EL(int height, double weight, String animalType, String bloodType, String habitat, boolean hasGills, String chargeRelease) {
        super(height, weight, animalType, bloodType, habitat, hasGills);
        this.chargeRelease=chargeRelease;
    }

    public String getChargeRelease() {
        return chargeRelease;
    }

    public void showInfo(){
        System.out.println(
                " Height = " + this.getHeight() +
                        " Weight = "  + this.getWeight() +
                        " AnimalType = " + this.getAnimalType() +
                        " BloodType = " + this.getBloodType() +
                        " Habitat = " + this.getHabitat() +
                        " HasGills = " + this.isHasGills() +
                        " ChargeRelease = " + this.getChargeRelease()
        );
    }

}
