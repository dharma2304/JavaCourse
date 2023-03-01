package Generics;

import java.util.LinkedList;
import java.util.List;

class Data<T>{
    private T myvar;

    public Data(T myvar) {
        this.myvar = myvar;
    }

    public T getMyvar() {
        return myvar;
    }
}
public class Example1 {
    public static void main(String args[]){
        List<Data<Integer>> li= new LinkedList<Data<Integer>>();

        li.add(new Data<Integer>(1));
        li.add(new Data<Integer>(2));
        li.add(new Data<Integer>(3));
        li.add(new Data<Integer>(4));

    }
}
