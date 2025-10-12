//    -1 represents ocean and 1 represents land find the number of islands in the given matrix.
//            Input:   n*n matrix
//                    1 -1 -1  1
//                   -1  1 -1  1
//                   -1 -1  1 -1
//                   -1 -1 -1  1
//    Output: 2 (two islands that I have
//    bold in matrix at 1, 1 and 2, 2)

public class NumOfIslands {

    // Directions for 4 neighbors (up, down, left, right)
    private static final int[] rowDir = {-1, 1, 0, 0};
    private static final int[] colDir = {0, 0, -1, 1};

    public static int numIslands(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    ans++;
                    dfs(grid, i, j);
                }
            }
        }
        return ans;
    }

    public static void dfs(int[][] grid, int i, int j) {
        // Mark current cell as visited
        grid[i][j] = -1;

        // Explore 4 directions
        for (int k = 0; k < 4; k++) {
            int newRow = i + rowDir[k];
            int newCol = j + colDir[k];

            if (newRow >= 0 && newRow < grid.length &&
                    newCol >= 0 && newCol < grid[0].length &&
                    grid[newRow][newCol] == 1) {
                dfs(grid, newRow, newCol);
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, -1, -1, 1},
                {-1, 1, -1, 1},
                {-1, -1, 1, -1},
                {-1, -1, -1, 1}
        };

        int result = numIslands(mat);
        System.out.println("Number of islands: " + result); // Output: 2
    }
}
//public class NumOfIslands {
//
//    // Directions for 8 neighbors (vertical, horizontal, diagonal)
//    private static final int[] rowDir = {-1, -1, -1, 0, 0, 1, 1, 1};
//    private static final int[] colDir = {-1, 0, 1, -1, 1, -1, 0, 1};
//
//    public static int numIslands(int[][] grid) {
//        int ans = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == 1) {
//                    ans++;
//                    dfs(grid, i, j);
//                }
//            }
//        }
//        return ans;
//    }
//
//    public static void dfs(int[][] grid, int i, int j) {
//        grid[i][j] = -1; // mark visited
//
//        for (int k = 0; k < 8; k++) {
//            int newRow = i + rowDir[k];
//            int newCol = j + colDir[k];
//
//            if (newRow >= 0 && newRow < grid.length &&
//                    newCol >= 0 && newCol < grid[0].length &&
//                    grid[newRow][newCol] == 1) {
//                dfs(grid, newRow, newCol);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[][] mat = {
//                {1, -1, -1, 1},
//                {-1, 1, -1, 1},
//                {-1, -1, 1, -1},
//                {-1, -1, -1, 1}
//        };
//        System.out.println(numIslands(mat)); // Output: 2
//    }
//}

