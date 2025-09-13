import java.util.Arrays;

public class Matrix90DegreeRotate {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}
                     };
        int n= mat.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int t=mat[i][j];
                mat[i][j]=mat[i][n-j-1];
                mat[i][n-j-1]=t;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
