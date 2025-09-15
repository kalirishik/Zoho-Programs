import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int a[] = {1,2,0,4,3,0,5,0};
        int n = a.length;
        int pos = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] != 0) {
                a[pos] = a[i];
                pos--;
            }
        }
        while (pos >= 0) {
            a[pos] = 0;
            pos--;
        }
        System.out.println(Arrays.toString(a));
    }
}
