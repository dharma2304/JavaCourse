package Generics;
/*

The type parameters naming conventions are important to learn generics thoroughly.
The common type parameters are as follows:

T – Type
E – Element
K – Key
N – Number
V – Value


 */

class NayaClass<K,V>{
    private K key;
    private V value;

    public NayaClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class NumberClass<N>{
    private N num;

    public NumberClass(N num) {
        this.num = num;
    }

    public N getNum() {
        return num;
    }
}


public class TypeParameters {
    public static void main(String args[]){

        NayaClass<Integer, String> nc = new NayaClass<Integer,String>(1, "Dharmendra");
        System.out.println(nc.getKey());
        System.out.println(nc.getValue());

        NumberClass<String> numClass = new NumberClass<String>("23.5f");
        System.out.println(numClass.getNum());


    }
}
