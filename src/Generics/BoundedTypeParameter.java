package Generics;

class BoundType<K,V>{
    private K key;
    private V value;

    public BoundType(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }


    public <E extends Character,N extends Number> void display(E element, N number){
        System.out.println(element+" "+number);
    }
}

public class BoundedTypeParameter {
    public static void main(String args[]){

        /*
         Bounded Type Parameter: It means we are restricting the parameter type to a particular type.
          For example:
          public <E, N extends Number> void display(E element, N Number)

          In the above method we are bounding the N parameter type to only number . We can bound with custom classes as well.
          The method accepts the arguments as element and number only. For the element we can give anything(number, string , etc)
          but for Number we have to give anything related to numbers(Integer, Float, Byte, Short, Double, etc)

         */

        BoundType<Integer, String > bt = new BoundType<Integer, String>(1, "Value");
        bt.display('q', 56.789);
    }

}
