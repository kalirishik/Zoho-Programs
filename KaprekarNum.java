import java.util.Scanner;
public class KaprekarNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(result(n));
    }
    public static boolean result(int n){
        if (n == 1) return true;
        long sq = (long) n * n;
        String str = String.valueOf(sq);
        int d = String.valueOf(n).length();
        int len = str.length();
        int right = (len <= d) ? Integer.parseInt(str) : Integer.parseInt(str.substring(len - d));
        int left = (len - d > 0) ? Integer.parseInt(str.substring(0, len - d)) : 0;
        return (left + right) == n;
    }
}
