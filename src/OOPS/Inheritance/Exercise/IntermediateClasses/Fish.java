package OOPS.Inheritance.Exercise.IntermediateClasses;

import OOPS.Inheritance.Exercise.ParentClasses.Animal;

public class Fish extends Animal {

    private String habitat;
    private boolean hasGills;



    public Fish(){
        super();
        this.habitat = "water";
        this.hasGills=true;
    }

    public Fish(int height, double weight, String animalType, String bloodType, String habitat, boolean hasGills) {
        super(height, weight, animalType, bloodType);
        this.habitat = habitat;
        this.hasGills = hasGills;
    }

    public String getHabitat() {
        return habitat;
    }

    public boolean isHasGills() {
        return hasGills;
    }

}
