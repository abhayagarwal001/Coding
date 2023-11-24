public class Pattern5 {
public static void main(String[] args) {
    int row=4;
    int space=row-1;
    int star=1;
    for(int i=0;i<row;i++){
       for(int j=0;j<space;j++){
        System.out.print(" ");
       }
       for(int j=0;j<star;j++){
        System.out.print("*");
       }
       space--;
       star++;
       System.out.println();
    }
}
}