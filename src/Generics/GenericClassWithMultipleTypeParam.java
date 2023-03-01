package Generics;

class MutlipleTypeParam<A, B>{
    A obj1;
    B obj2;

    public MutlipleTypeParam(A obj1, B obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public A getObj1() {
        return obj1;
    }

    public B getObj2() {
        return obj2;
    }

    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

public class GenericClassWithMultipleTypeParam {

    public static void main(String args[]){
        MutlipleTypeParam<String, Integer> mtp=new MutlipleTypeParam<String,Integer>("DHARMENDRA",230498);

        System.out.println(mtp.getObj1());
        System.out.println(mtp.getObj2());
        mtp.print();

    }

}
