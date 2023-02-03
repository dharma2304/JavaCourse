package OOPS.NestedClasses.InnerClass;

public class Shop {
    /*

    InnerClass: As the name suggests innerclass means a class inside a class. For instance if we have a car class then we have
    a engine as a inner class.The most useful type of innerclass is non static inner class.
     */
    public static void main(String [] args){
        Door door = new Door();
        door.shopStatus();
        Door.Lock lock =door.getLock();
    }
}
