public class Pattern7 {
public static void main(String[] args) {
    int row=5;

    for(int i=0;i<row;i++){
        int value=1;
       for(int j=0;j<row-i;j++){
          System.out.print(value);
          value++;
       }
       System.out.println();
    }
}
}