import java.util.*;

//    Greater on right side
//    You are given an array Arr of size N. Replace every element with the next greatest element (greatest element on its right side) in the array. Also, since there is no element next to the last element, replace it with -1.
//    Input:
//    N = 6
//    Arr[] = {16, 17, 4, 3, 5, 2}
//    Output:
//            17 5 5 5 2 -1
//    Explanation: For 16 the greatest element
//    on its right is 17. For 17 it's 5.
//    For 4 it's 5. For 3 it's 5. For 5 it's 2.
//    For 2 it's -1(no element to its right).
//    So the answer is 17 5 5 5 2 -1
//    Link: https://www.geeksforgeeks.org/problems/greater-on-right-side4305/1
public class GreaterRightSideElement {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        int maxFromRight = -1; // last element has no element on right

        // traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            res.add(0, maxFromRight); // insert the greatest element seen so far
            if (current > maxFromRight) {
                maxFromRight = current;
            }
        }
        return res;
    }

    // for testing
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> ans = nextGreatest(arr);
        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}
