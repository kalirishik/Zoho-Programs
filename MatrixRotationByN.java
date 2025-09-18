import java.util.Scanner;

public class MatrixRotationByN {
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
        int rotate=sc.nextInt();
        while(rotate-- >0){
            rotateMatrix(a,r,c);
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void rotateMatrix(int mat[][],int r,int c){
        int rs=0,re=r-1,cs=0,ce=c-1,prev=0,curr=0;
        while(rs<re && cs<ce){
            prev=mat[rs+1][cs];
            for(int i=cs;i<=ce;i++){
                curr=mat[rs][i];
                mat[rs][i]=prev;
                prev=curr;
            }
            rs++;

            for(int i=rs;i<=re;i++){
                curr=mat[i][ce];
                mat[i][ce]=prev;
                prev=curr;
            }
            ce--;

            for(int i=ce;i>=cs;i--){
                curr=mat[re][i];
                mat[re][i]=prev;
                prev=curr;
            }
            re--;

            for(int i=re;i>=rs;i--){
                curr=mat[i][cs];
                mat[i][cs]=prev;
                prev=curr;
            }
            cs++;
        }
    }
}
