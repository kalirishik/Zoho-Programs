
//    Given an array of integers of size n. Convert the array in such a way that if next valid number is same as current number, double its value and replace the next number with 0. After the modification, rearrange the array such that all 0’s are shifted to the end.
//    Input : arr[] = {2, 2, 0, 4, 0, 8}
//    Output : 4 4 8 0 0 0
//    Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
//    Output : 4 2 12 8 0 0 0 0 0 0

import java.util.Arrays;
public class ValueSameDouble {

    static void perform(int[] a) {
        int n = a.length;

        // Step 1: Merge equal adjacent non-zero elements
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != 0 && a[i] == a[i + 1]) {
                a[i] = a[i] * 2;  // double current
                a[i + 1] = 0;     // next becomes 0
                i++;               // skip the next element since it’s zero now
            }
        }

        // Step 2: Shift all non-zero elements to the front
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[pos++] = a[i];
            }
        }

        // Step 3: Fill remaining positions with 0
        while (pos < n) {
            a[pos++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] a1 = {2, 2, 0, 4, 0, 8};
        perform(a1);
        System.out.println(Arrays.toString(a1));  // Output: [4, 4, 8, 0, 0, 0]

        int[] a2 = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        perform(a2);
        System.out.println(Arrays.toString(a2));  // Output: [4, 2, 12, 8, 0, 0, 0, 0, 0, 0]
    }
}

