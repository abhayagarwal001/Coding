public class Pattern12{

    public static void main(String[] args) {
        int row=5;
        int space=row-1;
        int star=1;
        int value;
        for(int i=1;i<=row;i++){
               value=i;
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print(value+" ");
                if(j<=(star/2))
                value--;
                else
                value++;
            }
            space--;
            star=star+2;
            System.out.println();
        }
        
    }
}