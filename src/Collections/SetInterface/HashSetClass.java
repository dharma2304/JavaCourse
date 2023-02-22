package Collections.SetInterface;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String args[]){
        /*

        HashSet: HashSet is a class which implements Set interface.In HashSet the order of the elements may not be the same as order of insertion.
                 When an element is added to the hashset a hash code is calculated for the element and the element is added to appropriate bucket.
                 Bucket is a slot in the hash data structure.
                 Before storing any item into hashset, hashset checks whether this item is already present in it or not.

         */


        // Initialisation of hashset
        HashSet<String> hs = new HashSet<String>();

        // operations

        // 1. add(Object obj): This method can be used to add the new elements to the HashSet hs
        hs.add("India");
        hs.add("USA");
        hs.add("Canada");
        hs.add("United Kingdom");
        hs.add("India"); // duplicate element which cant be inserted into the hashset
        System.out.println("Adding the new elements to the hashset: "+" "+hs);

        // 2. size(): To get the number of elements in the hashset.
        System.out.println("Getting the size of the hashset: "+" "+hs.size());

        // 3. contains(Object obj):This method can be used to check the element is present in the hashset.
        System.out.println("Contains the element in the hashset:"+" "+hs.contains("India"));

        // 4. remove(Object obj): This method is used to remove the specified element from the hashset.
        hs.remove("Canada");
        System.out.println("Remove the element from the hashset: "+" "+hs);





    }
}
