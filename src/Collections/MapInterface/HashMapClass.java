package Collections.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String args[]){
        /*

        HashMap: HashMap is a class which implements the Map interface.It stores the data in key-value pairs and
                 we can access the values using key as an index since keys are unique.HashMap is similar to HashTable, but it is unsynchronized.
                 It allows to store the null keys as well, but there should be only one null key object and there can be any number of null values.  This class makes no guarantees as to the order of the map.



         */

        // Initialization of hashmap
        HashMap<Integer , String> map = new HashMap<>();

        // Operations on HashMap:

        // 1. put(key,value): This method is used to insert the key-value pair to the HashMap
        map.put(1, "Dharmendra");
        map.put(2, "Makineni");
        System.out.println("Adding the elements to the map: "+" "+map);

        // 2. Changing elements: After adding the elements , if we wish to change the value for a particular key then we can do using put method
        map.put(2,"M");
        System.out.println("Changing values for the keys: "+" "+map);

        // 3. remove(key): This method is used to remove the key-value pair by using the key .
        map.remove(2);
        System.out.println("Removing the key-value pair from the map: "+" "+map);

        /*
          4. Iterationg the hashmap: We cant use enhanced  iterators since they can handle only one data type.
                                     For HashMap we use Entry<?,?> to resolve the 2 separate types into a compatible format.
         */

          for(Map.Entry<Integer,String> e:  map.entrySet()){
              System.out.println("Key: "+" "+e.getKey()+" , "+"Value: "+" "+e.getValue());
          }


    }
}
