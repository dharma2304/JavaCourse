package OOPS.Inheritance.Exercise.IntermediateClasses;

import OOPS.Inheritance.Exercise.ParentClasses.Animal;

public class Reptile extends Animal {

    private String skin;
    private String backbone;
    private String softShelledEggs;


    public Reptile(){
         super();
         this.skin = "leather";
         this.backbone = "flexible";
         this.softShelledEggs="soft";
    }

    public Reptile(int height, double weight, String animalType, String bloodType, String skin, String backbone, String softShelledEggs) {
        super(height, weight, animalType, bloodType);
        this.skin = skin;
        this.backbone = backbone;
        this.softShelledEggs = softShelledEggs;
    }


    public String getSkin() {
        return skin;
    }

    public String getBackbone() {
        return backbone;
    }

    public String getSoftShelledEggs() {
        return softShelledEggs;
    }






}
