//    Print all possible subsets of the given array whose sum equal to given N.
//            example: Input: {1, 2, 3, 4, 5} N=6 Output: {1, 2, 3}, {1, 5}, {2, 4}

import java.util.*;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;

        System.out.println("Subsets with sum = " + target + ":");
        findSubsets(arr, target);
    }

    public static void findSubsets(int[] arr, int target) {
        List<Integer> current = new ArrayList<>();
        backtrack(arr, 0, target, 0, current);
    }

    private static void backtrack(int[] arr, int index, int target, int sum, List<Integer> current) {
        // If sum matches target → print subset
        if (sum == target) {
            System.out.println(current);
            return;
        }

        // Stop if sum exceeds target or end of array
        if (sum > target || index == arr.length) return;

        // Include current element
        current.add(arr[index]);
        backtrack(arr, index + 1, target, sum + arr[index], current);

        // Exclude current element
        current.remove(current.size() - 1);
        backtrack(arr, index + 1, target, sum, current);
    }
}
