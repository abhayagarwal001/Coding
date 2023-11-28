public class Pattern15 {

    public static void main(String[] args) {
        int row=5;
        int innerspace=-1;
        int outerspace=row*2-2;
        int star=1;
        
        // left upperpart
        for(int i=0;i<row;i++){
            for(int j=0;j<star;j++){
                System.out.print("* ");
            }
            for(int j=0;j<innerspace;j++){
                System.out.print("  ");
            }
            for(int j=0;j<star;j++){
                if(i>=1)
                System.out.print("* ");
            }
            
            //space
            for(int j=0;j<=outerspace;j++){
                System.out.print("  ");
            }

            //right upperpart
            for(int j=0;j<star;j++){
                System.out.print("* ");
            }
            for(int j=0;j<innerspace;j++){
                System.out.print("  ");
            }
            for(int j=0;j<star;j++){
                if(i>=1)
                System.out.print("* ");
            }

            System.out.println();
            innerspace=innerspace+1;
            outerspace=outerspace-2;
            
        }

        outerspace=0;
        innerspace=row-2;

        // left lowerpart
        for(int i=0;i<row;i++){
            for(int j=0;j<star;j++){
                if(i<=row-2)
                System.out.print("* ");
            }
            for(int j=0;j<innerspace;j++){
                System.out.print("  ");
            }
            for(int j=0;j<star;j++){
                System.out.print("* ");
            }
            
            //space
            for(int j=0;j<=outerspace;j++){
                System.out.print("  ");
            }

            //right lowerpart
            for(int j=0;j<star;j++){
                if(i<=row-2)
                System.out.print("* ");
            }
            for(int j=0;j<innerspace;j++){
                System.out.print("  ");
            }
            for(int j=0;j<star;j++){
                System.out.print("* ");
            }

            System.out.println();
            innerspace=innerspace-1;
            outerspace=outerspace+2;
            
        }




    }
}