package Operators.DecisonsWithOperators;

public class OperatorsWithIfElse {
    public static void main(String[] args){
        // If else statements are used to make decisions based on the conditions
        int x =5;
        int y =5;
        //equals to operator and not equals to operator
        if(x !=5){
        //if(x==5){
            System.out.println("x is 5");
        } else{
            System.out.println("x is not 5");
        }

        // > and <
        //if(x<y){
        if(x>y){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        // >= and <=
        //if(x<=y){
        if(x>=y){
            System.out.println("true");
        } else{
            System.out.println("false");
        }

        // && operator --> it will return when all the operands are true.
        boolean b = true;
        boolean l = false;

        if(b && l){
            System.out.println("return true when both the operands are true.");
        } else{
            System.out.println("false");
        }

        // || operator --> will return true when all the operands are true or anyone of the operands are true.
        if(b || l){
            System.out.println("return true when all the operands are true or anyone of the operands are true ");
        }


        // Exercise
        int ageOfBoy = 21;
        int ageOfGirl = 18;

        if(ageOfBoy >=21 && ageOfGirl>=18){
            System.out.println("Boy and Girl are eligible to be married ");
        } else{
            System.out.println("Boy and Girl are not eligible to be married");
        }

    }
}
