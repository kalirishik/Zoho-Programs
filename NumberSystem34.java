import java.util.Scanner;

public class NumberSystem34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuffer sb=new StringBuffer();
        while(n>0){
            if(n%2==0)
                sb.insert(0,4);
            else
                sb.insert(0,3);
            n=(n-1)/2;
            System.out.println(sb);
            System.out.println(n);
        }
        System.out.println(sb);
    }
}
