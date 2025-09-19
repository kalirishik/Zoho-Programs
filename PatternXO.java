import java.util.Scanner;

public class PatternXO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 || j==0 || i==r-1 || j==c-1)
                    System.out.print("X ");
                else
                    System.out.print("O ");
            }
            System.out.println();
        }
    }
}
