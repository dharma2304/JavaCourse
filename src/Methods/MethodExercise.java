package Methods;

public class MethodExercise {
    public static void main(String []args){
        CalculatePrime calprime = new CalculatePrime();
        double x =5.867889999;
        if(calprime.isPrime(x)){
            System.out.println("x is prime");
        } else{
            System.out.println("x is not prime");
        }
    }
}

 class CalculatePrime{

    boolean isPrime(int x){
        boolean prime=true;
        for(int i=2; i<x/2;i++){
            if(x%i ==0){
                prime=false;
                break;
            }
        }

        return prime;
    }

    boolean isPrime(double x){
        int y = (int)x;
        boolean prime=true;
        for(int i=2;i<y/2;i++){
            if(y%i ==0){
                prime=false;
                break;
            }
        }
        return prime;
    }
}
