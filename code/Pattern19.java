public class Pattern19 {
    public static void main(String[] args) {
        int row=5;
        int space=row;
        int star=row;
        for(int i=0;i<row;i++){
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            for(int j=0;j<star;j++){
                if((i>=1 && i<row-1) &&(j>=1 && j<star-1))
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            System.out.println();
            space--;
        }
    }
}
