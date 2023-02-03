package OOPS.FinalKeyword;

public class Main {
    public static void main(String args[]){
      Demo d = new Demo();
      System.out.println(d.getX());
      // We can acess the final methods from class Demo since class Demo extends the class ParentClass.
        d.himself();
        d.myself();
    }
}
