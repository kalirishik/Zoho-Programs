//    Given N. print the following snake pattern (say N = 4). condition:
//    must not use arrays ( 1D array  or 2D array like Matrix ).
//            1   2   3   4
//            8   7   6   5
//            9   10  11  12
//            16  15  14  13
public class PrintSnakePatternNum {
    public static void main(String[] args) {
        int n=4,num=1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                for(int j=1;j<=n;j++)
                    System.out.print(num++ +" ");
            }
            else{
                int end=num+n-1;
                for(int j=end;j>=num;j--)
                    System.out.print(j+" ");
                num=end+1;
            }
            System.out.println();
        }
    }
}
