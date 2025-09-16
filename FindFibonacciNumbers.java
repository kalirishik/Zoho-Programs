public class FindFibonacciNumbers {
    public static void main(String[] args) {
        int a[]={8,4,12,2,7};
        for(int num:a){
            if(findFibo(num))
                System.out.print(num+" ");
        }
    }
    public static boolean findFibo(int num){
        int f1=0,f2=1;
        while(f1<=num){
            if(f1==num) return true;
            if(f1>num) return false;
            int res=f1+f2;
            f1=f2;
            f2=res;
        }
        return false;
    }
}
