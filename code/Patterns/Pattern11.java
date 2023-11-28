package Patterns;
public class Pattern11{

    public static void main(String[] args) {
        int row=5;
        int space=row-1;
        int star=1;
        for(int i=1;i<=row;i++){
            int value=i;
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<star;j++){
                System.out.print(value+" ");
            }
            space--;
            star++;
            System.out.println();
        }
        
    }
}