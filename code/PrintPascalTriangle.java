public class PrintPascalTriangle {

    public static void main(String[] args) {
        int row=15;
        int space=row-1;
        int star=1;
        int value=1;
        int ans=3;
        for(int i=0;i<row;i++){
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }

            if(i>=4)
            ans=ans+(i-1);
            
            for(int j=0;j<star;j++){
                if(j==0 || j==star-1){
                System.out.print(value+" ");
                }
                else {
                    if(i>=2 && (j==1|| j==star-2)){
                    System.out.print(i+" ");
                    }
                    else {
                        if(i>=4 && (j==2|| j==star-3)){
                        System.out.print(ans+" ");
                        
                        }
                        else
                        System.out.print("* ");
                        
                }
                
            }
            
        }

        System.out.println();
            star++;
            space--;
    }
    }
}