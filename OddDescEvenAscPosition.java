import java.util.Arrays;
import java.util.Scanner;

public class OddDescEvenAscPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        performArray(a,n);
    }
    static void performArray(int a[],int n){
        for(int i=0;i<n;i++){
            if(i%2==0){
                int minInd=i;
                for(int j=i+1;j<n;j++){
                    if(j%2==0 && a[minInd]>a[j])
                        minInd=j;
                }
                if(i!=minInd){
                    int t=a[i];
                    a[i]=a[minInd];
                    a[minInd]=t;
                }
            }
            else{
                int maxInd=i;
                for(int j=i+1;j<n;j++){
                    if(j%2!=0 && a[maxInd]<a[j])
                        maxInd=j;
                }
                if(i!=maxInd){
                    int t=a[i];
                    a[i]=a[maxInd];
                    a[maxInd]=t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

/*
7
input : 13 2 4 15 12 10 5
output: 4 15 5 10 12 2 13
 */
