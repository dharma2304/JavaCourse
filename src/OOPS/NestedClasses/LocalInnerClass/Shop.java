package OOPS.NestedClasses.LocalInnerClass;

public class Shop {
    public static void main(String args[]){
        Door door = new Door();
        System.out.println(door.isLocked("test"));

        if(door.isLocked(args[0])){
            System.out.println("Shop is closed. Please come later");
        } else {
            System.out.println("Welcome shop is open");
        }
    }
}
