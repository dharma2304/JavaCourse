package OOPS.NestedClasses.AnonymousInnerClass;


public class Door {

      /*
       The below is syntax of anonymous inner class. In our case we have created an abstract class Lock.
       Usually  this abstract class will be extended by door class and implement the abstract methods inside it.
       But We can do this using anonymous inner class. It means class definition will be defined on the instantiation of object itself.
       We can create anonymous inner class for interfaces and abstract classes only.
       */
        private Lock lock = new Lock() {

            @Override
            public boolean isUnLocked(String key) {
                if (key.equals("QWERTY")) {
                    return true;
                } else {
                    return false;
                }
            }
        };

    public Lock getLock() {
        return lock;
    }
}
