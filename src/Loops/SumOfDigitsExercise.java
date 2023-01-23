package Loops;

public class SumOfDigitsExercise {
    public static void main(String[] args){
        int x = 35890;
        int sum =0;
        while(x>0){
            int remainder = x%10;
            sum = sum+remainder;
            x = x/10;
        }
        System.out.println(sum);
    }
}
