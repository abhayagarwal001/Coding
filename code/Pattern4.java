public class Pattern4 {
public static void main(String[] args) {
    int row=4;
    for(int i=0;i<row;i++){
       for(int j=0;j<row-i;j++){
        System.out.print("*");
       }
       System.out.println();
    }
}
}