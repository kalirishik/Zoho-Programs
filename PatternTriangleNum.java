import java.util.Scanner;

public class PatternTriangleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = 1, k = 0;
        for (int i = 0; i < n; i++) {
            for (int sp = 0; sp < n - i - 1; sp++)
                System.out.print(" ");
            for (int j = 0; j < i + 1; j++) {
                System.out.print(v + " ");
                v--;
            }
            k += 2;
            v += k + 1;
            System.out.println();
        }
        int v2 = (n * (n + 1)) / 2;
        for (int i = 0; i < n; i++) {
            for (int sp = 0; sp < i; sp++)
                System.out.print(" ");
            for (int j = 0; j < n - i; j++)
                System.out.print(v2-- + " ");
            System.out.println();
        }
    }
}
