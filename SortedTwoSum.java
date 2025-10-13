//    Given sorted array check if two numbers sum in it is a givenvalue
//    Input
//    Array = {1 3 4 8 10 } N = 7
//    output: true

public class SortedTwoSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8, 10};
        int N = 7;
        System.out.println(hasPairWithSum(arr, N)); // Output: true
    }
}
