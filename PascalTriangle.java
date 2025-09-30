public class PatternPascalTriangle {
    public static void main(String[] args) {
        int n=5;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++)
//                System.out.print(" ");
//            int val=1;
//            for(int j=0;j<=i;j++){
//                System.out.print(val+" ");
//                val=val*(i-j)/(j+1);
//            }
//            System.out.println();
//        }
        int result[][]=new int[n][];
        for(int i=0;i<n;i++){
            result[i]=new int[i+1];
            for(int j=0;j<n-i-1;j++)
                System.out.print(" ");
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    result[i][j]=1;
                    System.out.print(result[i][j]+" ");
                }
                else{
                    result[i][j]=result[i-1][j]+result[i-1][j-1];
                    System.out.print(result[i][j]+" ");
                }
            }
            System.out.println();
        }

    }
}

//              1
//             1 1
//            1 2 1
//           1 3 3 1
//          1 4 6 4 1
