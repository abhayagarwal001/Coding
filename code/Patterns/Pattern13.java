package Patterns;
public class Pattern13 {
    public static void main(String[] args) {
        int row=4;
        int space=row*2-2;
        int star=1;
        
        //upper
        for(int i=0;i<row;i++){
            for(int j=0;j<star;j++){
                System.out.print("* ");
            }
            for(int j=0;j<space;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<star;j++){
                System.out.print("* ");
            }
            System.out.println();
            space=space-2;
            star=star+1;
       }

       //lower
       space=0;
       star=row;
       for(int i=0;i<row;i++){
            for(int j=0;j<star;j++){
                System.out.print("* ");
            }
            for(int j=0;j<space;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<star;j++){
                System.out.print("* ");
            }
            System.out.println();
            space=space+2;
            star=star-1;
       }



    }
}
