package VariablesAndDatatypes;

public class TypeCasting {
    public static void main(String [] args){
        /*
          Type Casting: Converting the data type of a variable to another

          In Java typecasting is classified into two types

          1.implicit typecasting: Java will take care of type conversion internally

          byte->short->int->long==> As per the order byte can be converted to short and
              &
          float -> double           short can be converted to int and
                                     int can be converted to long
                                     but the reverse order is not possible

          2. Explicit type casting : We have to explicitly specify the type we want to convert

          Generally implicit typecasting is preferred over the explicit typecasting due to loss of data.

         */

        //implicit typecasting: Java will take care of type conversion internally
        // Here short type is internally converted to int when x is assigned to y.But int cannot be converted to short because the range of int is bigger compared to short
        short x = 56;
        int y =x;
        System.out.println(y);

        // explicit typecasting: We have to externally specify the type we want to convert
        long lg = 345567899;
        int it = (int)lg;
        System.out.println(it);

        double db = 345.5677d;
        float ft = (float)db;
        System.out.println(ft);

        float ft1 = 10.5678f;
        int it2 = (int)ft1;
        System.out.println(it2);
    }

}
