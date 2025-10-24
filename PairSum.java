//    Given an array A[] and a number x, check for pair in A[] with sum as x.
//            Eg : Input {1, 2, 4, 3, 5, 6}
//    SUM : 5
//    Output : 2 (1, 4) & (2, 3)
import java.util.*;
public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 6};
        int x = 5; // target sum
        int count = 0;

        System.out.println("Pairs with sum " + x + " are:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    count++;
                }
            }
        }

        System.out.println("Total pairs: " + count);

        HashSet<Integer> seen = new HashSet<>();
        int count1 = 0;

        System.out.println("Pairs with sum " + x + " are:");

        for (int num : arr) {
            int complement = x - num;

            // if complement already exists, we found a pair
            if (seen.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
                count1++;
            }

            // add the current number to the set
            seen.add(num);
        }

        System.out.println("Total pairs: " + count);

    }
}
