import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {
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
            for(int j=i+1;j<c;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(int i=0;i<r;i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
