package Function;

import java.util.Scanner;

public class primeNumber {
    
    public static boolean isPrime(int number){
        
        boolean isPrime=true;

        for(int i=2;i<number/2;i++){
            if(number%i==0)
            {
                isPrime=false;
                break;
            }
            
        }
        if(isPrime){
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter  Number:");
        int n=sc.nextInt();
        boolean ans=isPrime(n);
        if(ans){
            System.out.println("Prime No");
        }
        else
        {
            System.out.println("Not Prime");
        }

    }
}
