public class SnakeMatrixTraversal {
    public static void main(String[] args) {
        int a[][]={{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
        int r=a.length,c=a[0].length;
        for(int i=0;i<r;i++){
            if(i%2==0){
                for(int j=0;j<c;j++)
                    System.out.print(a[i][j]+" ");
            }
            else{
                for(int j=c-1;j>=0;j--)
                    System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
