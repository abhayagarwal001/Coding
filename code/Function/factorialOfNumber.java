package Function;

import java.util.Scanner;

public class factorialOfNumber {
    
    public static int calculateFactorial(int number){
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        int ans=calculateFactorial(n);
        System.out.println("Factorial of "+n+" is: "+ans);

    }
}
