package Loops;

public class ForLoop {
    public static void main(String[] args){
        // for loop

        for(int i =0; i<100; i++){
            System.out.println(i);
        }

        System.out.println("---------------------------");
        // print 100 to 1 numbers in reverse order
        for(int i=100; i>=1; i--){
            System.out.println(i);
        }

        // Exercise to check whether the given number is a prime number or not
        int isPrime = 25;
        boolean flag =false;
        for(int i=2; i<isPrime/2; i++ ){
            if(isPrime%i == 0) {
                flag =true;
                break;
            }


        }
        if(flag){
            System.out.println("Its not a prime number");
        }else{
            System.out.println("Its a prime number");
        }

        // Making use of 2 variables
        for(int i=1 ,j=1;i<10 && j<10; i++,j++){
            System.out.println("i= "+i + " and j= "+j);
        }
    }
}
