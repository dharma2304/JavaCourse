package OOPS.Encapsulation;

public class Person {
    // Lets define the properties as public in this class.
//    public String name;
//    public int age;
//    public String address;

    /*
    But by defining these properties as public, they are easily accessible when we instantiate the class
    and change the values of them by directly assigning the values(values may be wrong).
    We need to make them as private which means these are accessible to this class only.
    If we want to access these properties outside of this class we need to access them via setters and getters.
    This is called Encapsulation. It is defined as hiding the properties/data of the class by making them as private.
     */
    private String name;
    private int age;
    private String address;


    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
