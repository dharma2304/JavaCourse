package OOPS.NestedClasses.InnerClass;

public class Door {
  private Lock lock;

    public Door() {
        this.lock = new Lock(true);
    }

    public Lock getLock() {
        return lock;
    }

    public void shopStatus(){
        if(lock.isLock()){
            System.out.println("Shop is close please come later");
        } else{
            System.out.println("Shop is open");
        }
    }

    class Lock{
      private boolean lock;

      public Lock(boolean lock) {
          this.lock = lock;
      }

      public boolean isLock() {
          return lock;
      }

      public void setLock(boolean lock) {
          this.lock = lock;
      }
  }
}
