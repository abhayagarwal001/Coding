public class Pattern10 {
    public static void main(String[] args) {
        int row=5;
        int space=4;
        for(int i=0;i<row;i++){
        for(int j=0;j<space;j++){
            System.out.print("  ");
        }
        for(int j=0;j<row;j++){
            System.out.print("* ");
        }
        space--;
        System.out.println();
        }
    }
}
