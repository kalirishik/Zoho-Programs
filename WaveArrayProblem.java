//Wave Array Problem
//
//Given an array of integers, rearrange the elements into a wave-like array.
//
//Condition:
//a1 >= a2 <= a3 >= a4 <= a5 ...
//
//Input:
//arr = [3, 6, 5, 10, 7, 20]
//
//Output:
//        [6, 3, 10, 5, 20, 7]  (one possible output)
//
//Explanation:
//        - The array is rearranged so that every alternate element is greater than or equal to its neighbors.
//- Here: 6 >= 3 <= 10 >= 5 <= 20 >= 7
//        - Multiple correct outputs are possible as long as the wave condition is satisfied.

import java.util.Arrays;

public class WaveArrayProblem {
    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 10, 7,20};
        makeWave(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void makeWave(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i += 2) {
            // Compare with previous element
            if (i > 0 && arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            // Compare with next element
            if (i < n - 1 && arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}

