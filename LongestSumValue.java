import java.util.Scanner;

public class LongestSumValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        performArray(a);
    }
    static void performArray(int a[]){
        int maxV=0;
        for(int num:a){
            if(maxV<num)
                maxV+=num;
        }
        System.out.println(maxV);

    }
}
