package Collections.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String args[]){
      /*

      Before getting into iterators we have to know about cursors. A java cursor is an iterator which is used to iterate
      or traverse or retrieve the collection or stream objects elements one by one.

      There are majorly 3 cursors in java
      1. Iterator
      2. Enumeration
      3. ListIterator

      1. Iterator: Iterators in java are used in collection framework to retrieve elements one by one. It is an universal Iterator
                   as we can apply to any collection object.By using iterator we can perform both read and remove operations.
                   Iterator must be used whenever we want to enumerate elements in all Collection framework implemented interfaces like
                   Set, List, Queue, Deque, and all implemented classes of Map interface. Iterator is the only cursor available for the entire collection framework.


      Syntax:
      Iterator object can be created by calling iterator() method present in Collection interface.

      Iterator itr = c.iterator();

      // Methods of the iterator

      1. hasNext(): Returns true if the iteration has more elements.
        public boolean hasNext();

      2. next(): Returns the next element in the iteration. It throws NoSuchElementException if no more element is present.

      public Object next();

      3. remove(): Removes the next element in the iteration. This method can be called only once per call to next().
      public void remove();

       */

        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<10;i++)
            al.add(i);

        System.out.println(al);

        Iterator itr = al.iterator();
        System.out.println(itr);

        while(itr.hasNext()){

            int i =  (int) itr.next();
            System.out.print(i+"  ");

            if(i%2 ==0){
                itr.remove();
            }

        }

        System.out.println();

        System.out.println(al);



    }
}
