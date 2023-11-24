public class Pattern6 {
public static void main(String[] args) {
    int row=5;

    for(int i=0;i<row;i++){
        int value=1;
       for(int j=0;j<i+1;j++){
          System.out.print(value);
          value++;
       }
       System.out.println();
    }
}
}