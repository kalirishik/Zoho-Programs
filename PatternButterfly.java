import java.util.Scanner;
public class PatternButterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("*");
            for(int sp=1;sp<=2*(n-i);sp++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++)
                System.out.print("*");
            for(int sp=1;sp<=i*2-2;sp++)
                System.out.print(" ");
            for(int j=1;j<=n-i+1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

//5
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
