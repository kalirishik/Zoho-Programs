import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrix {
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
//        int a[][]={{1,2,3,4},
//                   {5,6,7,8},
//                   {9,10,11,12}
//                    };
//        int r=a.length,c=a[0].length;
        int rs=0,re=r-1,cs=0,ce=c-1;
        ArrayList<Integer> res=new ArrayList<>();
        while(rs<=re && cs<=ce){

            for(int i=cs;i<=ce;i++)
                res.add(a[rs][i]);
            rs++;

            for(int i=rs;i<=re;i++)
                res.add(a[i][ce]);
            ce--;

            if(rs<=re){
                for(int i=ce;i>=cs;i--)
                    res.add(a[re][i]);
                re--;
            }
            if(cs<=ce){
                for(int i=re;i>=rs;i--)
                    res.add(a[i][cs]);
                cs++;
            }
        }
        System.out.println(res);
    }
}
