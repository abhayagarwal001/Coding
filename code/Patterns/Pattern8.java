package Patterns;
public class Pattern8 {
public static void main(String[] args) {
    int row=5;
    int value=1;

    for(int i=0;i<row;i++){
        
       for(int j=0;j<=i;j++){
          System.out.print(value+" ");
          value++;
       }
       System.out.println();
    }
}
}