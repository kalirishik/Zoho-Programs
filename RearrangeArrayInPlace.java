//Given an array of integers, write a program to re-arrange the array in the given form.
//        1st_largest, 1st_smallest, 2nd_largest, 2nd_smallest, 3rd_largest ……. etc.
import java.util.*;
public class RearrangeArrayInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Sort the array
        Arrays.sort(arr);

        int maxIndex = n - 1;  // largest element index
        int minIndex = 0;      // smallest element index
        int maxElem = arr[n - 1] + 1; // used for encoding

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // place largest at even index
                arr[i] += (arr[maxIndex] % maxElem) * maxElem;
                maxIndex--;
            } else {
                // place smallest at odd index
                arr[i] += (arr[minIndex] % maxElem) * maxElem;
                minIndex++;
            }
        }

        // decode to get final values
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / maxElem;

        System.out.println("Rearranged array:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
