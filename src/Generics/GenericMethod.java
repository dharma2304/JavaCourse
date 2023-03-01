package Generics;

import java.util.ArrayList;
import java.util.List;

class MethodsGeneric{
    public <T>  void displayArrayList(List<T> list){
           for(T l:list){
               System.out.println(l);
           }
    }

    public <T> void displayArray( T[] array){
        for(T a: array){
            System.out.println(a);
        }
    }
}
public class GenericMethod {
    public static void main(String args[]){
      List<String> li = new ArrayList<>();
      li.add("One");
      li.add("Two");
      li.add("Three");
      li.add("Four");

      Integer[] arr = {1,2,3,4,5};
      String[] strarr = new String[5];
      strarr[0]="one";
      strarr[1]="Two";
      strarr[2]="Three";
      strarr[3]="Four";
      strarr[4]="Five";

      MethodsGeneric mg = new MethodsGeneric();
      mg.displayArrayList(li);
      mg.displayArray(strarr);

    }
}
