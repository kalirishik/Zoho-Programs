//    Given a Boolean matrix mat[M][N] of size M X N,
//    modify it such that if a matrix cell mat[i][j] is 1 then make its adjacent cells as 0.
//    Input:
//            1 0 1
//            0 1 0
//            1 1 1
//    Output:
//            1 0 1
//            0 1 0
//            1 0 1
//    Explanation:
//    For the cell mat[0][0] which is 1, its adjacent cells (mat[0][1] and mat[1][0]) are modified to 0.
//    For the cell mat[1][1] which is 1, its adjacent cells (mat[0][1], mat[1][0], mat[1][2], and mat[2][1]) are modified to 0.
//    The modification is not applied to the cell mat[2][2] as it doesn't have all four adjacent cells.
public class MatrixAdjacentZero {
    public static void main(String[] args) {
        int n=3;
        int mat[][]={{1,0,1},
                     {0,1,0},
                     {1,1,1}
                     };

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    if(i+1<n && i+1>=0)
                        mat[i+1][j]=0;
                    if(i-1<n && i-1>=0)
                        mat[i-1][j]=0;
                    if(j+1<n && j+1>=0)
                        mat[i][j+1]=0;
                    if(j-1<n && j-1>=0)
                        mat[i][j-1]=0;
                }
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
