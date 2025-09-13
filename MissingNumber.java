public class MissingNumber {
    public static void main(String[] args) {
        int a1[]={0,1,2,4};
        int a2[]={};
        int a3[]={1,2};
        find(a1);
        find(a2);
        find(a3);

    }
    static void find(int arr[]){
        int n=arr.length;
        if(n==0)
            System.out.println(0);
        else{
            int total=n*(n+1)/2;
            for(int num:arr)
                    total-=num;
            System.out.println(total);
        }
    }
}
