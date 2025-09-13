public class BitonicArray {
    public static void main(String[] args) {
        int a[]={1,3,8,12,4,2};
        System.out.println(find(a));
    }
    public static int find(int a[]){
        int left=0,right=a.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(a[mid]>a[mid-1] && a[mid]>a[mid+1])
                return a[mid];
            else if(a[mid-1]>a[mid])
                right=mid-1;
            else
                left=mid+1;
        }
        return -1;
    }
}
