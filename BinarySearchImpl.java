import java.util.Scanner;

public class BinarySearchImpl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int e=sc.nextInt();
        int l=0,r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==e){
                System.out.println("Element found at index: "+mid);
                return;
            }
            else if(a[mid]<e)
                l=mid+1;
            else
                r=mid-1;
        }
        System.out.println("Element not found");
    }
}
