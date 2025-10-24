//Finding all permutations of a string. ( backtracking approach ).

public class StringPermutations {
    public static void main(String[] args) {
        String str = "ABC"; // input string
        permute(str.toCharArray(), 0, str.length() - 1);
    }

    // Backtracking function
    static void permute(char[] arr, int l, int r) {
        if (l == r) {
            System.out.println(String.valueOf(arr)); // one permutation
            return;
        }

        for (int i = l; i <= r; i++) {
            swap(arr, l, i);           // choose
            permute(arr, l + 1, r);    // explore
            swap(arr, l, i);           // backtrack
        }
    }

    // Swap helper function
    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
