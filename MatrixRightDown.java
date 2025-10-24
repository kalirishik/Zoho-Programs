//Given a matrix NxN, you are initially in the 0, 0 position. The matrix is filled with ones and zeros. Value “one” represents the path is available, while “zero” represents the wall. You need to find the can you able to reach the (N-1)x(N-1) index in the matrix. You can move only along the right and down directions if there’s “one” available.
//    Input:
//        5 //N value
//        1 0 1 0 0
//        1 1 1 1 1
//        0 0 0 1 0
//        1 0 1 1 1
//        0 1 1 0 1
//    Output: Yes
public class MatrixRightDown {
    static int n = 5;
    static int a[][];

    public static void main(String[] args) {
        a = new int[][]{
                {1, 0, 1, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 1, 0},
                {1, 0, 1, 1, 1},
                {0, 1, 1, 0, 1}
        };

        if (canReach(0, 0))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    // Recursive function to check if path exists
    public static boolean canReach(int i, int j) {
        // Base conditions
        if (i < 0 || j < 0 || i >= n || j >= n || a[i][j] == 0)
            return false;

        // If we reach destination (bottom-right corner)
        if (i == n - 1 && j == n - 1)
            return true;

        // Mark current cell as visited (to avoid infinite loops)
        a[i][j] = 0;

        // Move right or down only
        if (canReach(i, j + 1) || canReach(i + 1, j))
            return true;

        return false;
    }
}

