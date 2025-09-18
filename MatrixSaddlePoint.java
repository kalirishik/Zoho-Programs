import java.util.Scanner;

public class MatrixSaddlePoint { // smallest row value and largest column value
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            int minRowValue=a[i][0];
            int minRowIndex=0;
            for(int j=1;j<c;j++){
                if(minRowValue>a[i][j]){
                    minRowValue=a[i][j];
                    minRowIndex=j;
                }
            }
            boolean isSaddle=true;
            for(int k=0;k<c;k++){
                if(a[k][minRowIndex]>minRowValue){
                    isSaddle=false;
                    break;
                }
            }
            if(isSaddle){
                System.out.println("Matrix Saddle Point: "+minRowValue);
                return;
            }
        }
        System.out.println("No Saddle point found");
    }
}
