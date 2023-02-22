package Collections.ListInterface;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]){

        /*

         LinkedList: It is a class which implements the List Interface. This class internally implements the linkedlist data structure
                     which stores the elements in non-contagious locations in memory. We refer each element in the linked list as node.
                     Each node has 2 parts. one is data of the current node and the other one is address part which has the address of
                     next node.
         */

        // Initialising the linkedlist
        LinkedList<String> ll = new LinkedList<>();

        // Operations on linked list:

        // 1. add(object): This method is used to add an element at the end of linked list.
        ll.add("Dharmendra");
        ll.add("Makineni");
        ll.add("is");
        ll.add("learning");
        ll.add("java");
        System.out.println("Adding the elements to the linkedlist: "+" "+ll);

        // 2. add(int index, Object obj): This method is used to add the element at the particular index in the linked list
        ll.add(4, "complete");
        System.out.println("Adding the elements to the linkedlist at particular index: "+" "+ll);

        // 3. set(int index, object): This method is used to update the element of a particular index with another element
        ll.set(4, "full");
        System.out.println("Updating the element at the particular index: "+" "+ll);

        // 4. remove(object): This method removes the object specified in the linkedlist
        ll.remove("full");
        System.out.println("Removing the specified element in the linked list: "+" "+ll);

        // 5. remove(int index): This method will remove the element at the particular index.
        ll.remove(4);
        System.out.println("Removing the element at the particular index: "+" "+ll);

        // 6. toArray(): This method converts the linkedlist to array.
        ll.toArray();
        System.out.println("Converting the linked list to array: "+" "+ll);

        // 7. removeFirst(): This method will remove the first element in the linkedlist
        ll.removeFirst();
        System.out.println("Removing the first element: "+" "+ll);

        // 8. removeLast(): This me
    }
}
