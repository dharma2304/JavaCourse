package Collections.JavaCursors.ListIterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterators {
    public static void main(String args[]){
        /*
        It is only applicable for List collection implemented classes like ArrayList, LinkedList, etc.
        It provides bi-directional iteration. ListIterator must be used when we want to enumerate elements of List.
        This cursor has more functionality(methods) than iterator.
        ListIterator object can be created by calling listIterator() method present in the List interface.
        Syntax:
        ListIterator li = c.listIterator();
        // Methods:
        // For Forward direction
        1. hasNext(): Returns true if the iteration has next elements
        public boolean hasNext();
        2. next(): Returns next element in the iteration
        pulbic Object next();
        3. nextIndex(): Returns the next element index or list size if the list iterator is at the end of the list.
        public int nextIndex();
        // For Backward direction:
        1. hasPrevious(): Returns true if the iteration has more elements while traversing backward.
        public boolean hasPrevious();
        2. previous(): Returns the previous element in the iteration and can throw NoSuchElementException if no more element present.
        public Object previous();
        3. previousIndex(): Returns the previous element index or -1 if the list iterator is at the beginning of the list
        public int previousIndex();
        // Other methods
        1. remove(): Removes the next element in the iteration
           public void remove();
        2. set(Object obj): Replaces the last element returned by next() or previous() with the specified element.
           public void set(Object obj);
        3. add(Object obj): Inserts the specified element into the list at the position before the element that would be returned by next()
           public void add(Object obj)
         */

        List<Integer> li = new ArrayList<>();

        for(int i=0; i<10; i++){
            li.add(i);
        }

        System.out.println(li);

        ListIterator litr = li.listIterator();

        while(litr.hasNext()){
            Integer i = (Integer)litr.next();
            if(i%2 ==0){
                i++;
                litr.set(i);
                litr.add(i);
            }
        }

        System.out.println(li);

    }
}
