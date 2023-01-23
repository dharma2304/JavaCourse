package OOPS.Inheritance.Exercise.IntermediateClasses;

import OOPS.Inheritance.Exercise.ParentClasses.Animal;

public class Birds extends Animal {

    private boolean withFeathers;
    private boolean canFly ;


    public Birds(){
        super();
        this.withFeathers=true;
        this.canFly=true;
    }

    public Birds(int height, double weight, String animalType, String bloodType, boolean withFeathers, boolean canFly) {
        super(height, weight, animalType, bloodType);
        this.withFeathers = withFeathers;
        this.canFly = canFly;
    }

    public boolean isWithFeathers() {
        return withFeathers;
    }

    public boolean isCanFly() {
        return canFly;
    }

}
