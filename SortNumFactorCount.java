import java.util.Arrays;

public class SortNumFactorCount {
    public static void main(String[] args) {
        int a[]={8,4,12,2,7};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(countFactor(a[j])<countFactor(a[j+1])){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static int countFactor(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0)
                count++;
        }
        return count;
    }
}
