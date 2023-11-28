package Patterns;
public class Pattern17 {
    public static void main(String[] args) {
        
        int row=5;
        int star=row;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=star;j++){
            System.out.print(i);   
            }
            System.out.println();
            star=star-1;         
        }
    }
}
