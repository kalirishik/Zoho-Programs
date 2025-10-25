public class MatrixSetRowColZero {
    public static void main(String[] args) {
        int mat[][]={{1,1,1},
                {1,0,1},
                {1,1,1}};
        performArray(mat,mat.length,mat[0].length);

    }
    public static void performArray(int mat[][],int row, int col){
        boolean rowZero[]=new boolean[row];
        boolean colZero[]=new boolean[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    rowZero[i]=true;
                    colZero[j]=true;
                }
            }
        }
        for(int i=0;i<row;i++){
            if(rowZero[i]){
                for(int j=0;j<col;j++){
                    mat[i][j]=0;
                }
            }
            if(colZero[i]){
                for(int j=0;j<col;j++){
                    mat[j][i]=0;
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

