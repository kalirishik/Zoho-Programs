import java.util.Scanner;

public class OddAscEvenDesc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        performArray(arr,n);
    }
    public static void performArray(int arr[],int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]%2==0){
                int maxInd=i;
                for(int j=i+1;j<n;j++){
                    if(arr[j]%2==0 && arr[maxInd]<arr[j])
                        maxInd=j;
                }
                if(maxInd!=i){
                    int t=arr[i];
                    arr[i]=arr[maxInd];
                    arr[maxInd]=t;
                }
            }
            else if(arr[i]%2!=0){
                int minInd=i;
                for(int j=i+1;j<n;j++){
                    if(arr[j]%2!=0 && arr[minInd]>arr[j])
                        minInd=j;
                }
                if(minInd!=i){
                    int t=arr[i];
                    arr[i]=arr[minInd];
                    arr[minInd]=t;
                }
            }
        }
        for(int num:arr)
            System.out.print(num+" ");
    }
}
/*
example 1 :

input: [9,4,3,2,7,8,5]

output: [3,8,5,4,7,2,9]

example 2:

input: [6,1,4,9,2,7]

output: [6,1,4,7,2,9]

*/
