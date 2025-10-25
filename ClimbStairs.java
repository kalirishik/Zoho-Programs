public class ClimbStairs{
    public static void main(String[] args) {
//        int n1=2;
//        System.out.println(findClimbingStairs(n1));
        int n2=6;
        System.out.println(findClimbingStairs(n2));
    }

    public static int findClimbingStairs(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        int f[]=new int[n+1];
        f[0]=1;
        f[1]=1;
        for(int i=2;i<f.length;i++)
            f[i]=f[i-1]+f[i-2];
        return f[n];
    }
}