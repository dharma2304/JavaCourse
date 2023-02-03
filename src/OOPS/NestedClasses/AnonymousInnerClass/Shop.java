package OOPS.NestedClasses.AnonymousInnerClass;

public class Shop {
    public static void main(String args[]){
      Door door = new Door();
        System.out.println(door.getLock().isUnLocked("test"));
    }

}
