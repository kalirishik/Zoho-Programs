import java.util.Scanner;

public class PatternDiamondStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<=n-i;sp++)
                System.out.print(" ");
            for(int j=1;j<=i*2-1;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int sp=1;sp<=i;sp++)
                System.out.print(" ");
            for(int j=1;j<=(n-i)*2-1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

//5
//            *
//           ***
//          *****
//         *******
//        *********
//         *******
//          *****
//           ***
//            *
