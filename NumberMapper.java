//Input: 1 2 3 4
//Output:
//   1 -> 9
//   2 -> 2
//   - Count how many times each number is repeated.
//   - If a number occurs only once (example: 2, 3, 4), then add all other numbers. → 1 -> 9
//   - If a number occurs multiple times (example: 1 appears 2 times), then add those occurrences. → 2 -> 2

import java.util.Scanner;

public class NumberMapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            totalSum += a[i];
        }

        // To track which elements are already processed
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue; // skip already processed numbers

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true; // mark duplicate as processed
                }
            }

            if (count > 1) {
                System.out.println(a[i] + " -> " + count);
            } else {
                System.out.println(a[i] + " -> " + (totalSum - a[i]));
            }
        }
    }
}

