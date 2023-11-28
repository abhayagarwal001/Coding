package Patterns;
public class Pattern18 {
    public static void main(String[] args) {
        int row=5;
        int space=row-1;
        int star=1;
        
        for(int i=0;i<row;i++){
            int value=1;
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            for(int j=0;j<star;j++){
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
            space--;
            star++;
        }
    }
}
