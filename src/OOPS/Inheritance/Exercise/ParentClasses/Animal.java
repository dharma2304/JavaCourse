package OOPS.Inheritance.Exercise.ParentClasses;

public class Animal {
    private int height;
    private double weight;
    private String animalType;
    private String bloodType;


    public Animal(){
        this.height = 30;
        this.weight = 24.56;
        this.animalType="Reptile";
        this.bloodType="Red";
    }


    public Animal(int height, double weight, String animalType, String bloodType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }


    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getBloodType() {
        return bloodType;
    }



}
