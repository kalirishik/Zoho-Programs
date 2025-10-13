//    Sample Input – Alternate Sorting
//    Input: {1, 2, 3, 4, 5, 6, 7}
//    output: {7, 1, 6, 2, 5, 3, 4}

import java.util.Arrays;
public class AlternateSorting {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        alternateSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void alternateSort(int[] arr) {
        Arrays.sort(arr); // First, sort the array

        int n = arr.length;
        int maxIdx = n - 1, minIdx = 0;
        int maxElem = arr[maxIdx] + 1; // Choose a number greater than all elements

        // Encode both new and old values in the same array
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Even index → put max element
                arr[i] += (arr[maxIdx] % maxElem) * maxElem;
                maxIdx--;
            } else {
                // Odd index → put min element
                arr[i] += (arr[minIdx] % maxElem) * maxElem;
                minIdx++;
            }
        }

        // Decode final values
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElem;
        }
    }
}
