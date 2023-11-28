package Function;

import java.util.Scanner;

public class evenOddNumber {
 
    public static void isEven(int number){
        if(number%2==0)
        System.out.println("Even No");
        else
        System.out.println("Odd No");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number:");
        int n=sc.nextInt();
        isEven(n);

    
    }
}
