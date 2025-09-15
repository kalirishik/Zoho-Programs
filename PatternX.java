public class PatternX {
    public static void main(String[] args) {
        int n=7;
        int n1=1,n2=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j && i+j==n+1){
                    System.out.print(n1+" ");
                    n1++;
                    n2--;
                }
                else if(i==j)
                    System.out.print(n1++ +" ");
                else if(i+j==n+1)
                    System.out.print(n2--+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
