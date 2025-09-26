import java.util.Scanner;

public class PatternDoubleTriNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<i;sp++)
                System.out.print(" ");
            for(int j=i;j<=n;j++)
                System.out.print(j +" ");
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int sp=1;sp<=n-i-1;sp++)
                System.out.print(" ");
            for(int j=n-i;j<=n;j++)
                System.out.print(j +" ");
            System.out.println();
        }
    }
}
//5
//         1 2 3 4 5
//          2 3 4 5
//           3 4 5
//            4 5
//             5
//            4 5
//           3 4 5
//          2 3 4 5
//         1 2 3 4 5
