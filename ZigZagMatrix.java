public class ZigZagMatrix {
    public static void printZigZag(int[][] matrix) {
        int n = matrix.length;       // Rows
        int m = matrix[0].length;    // Columns

        for (int i = 0; i < n + m - 1; i++) {
            if (i % 2 == 0) {
                // Even diagonal → move up (↗)
                int row = Math.min(i, n - 1);
                int col = i - row;
                while (row >= 0 && col < m) {
                    System.out.print(matrix[row][col] + " ");
                    row--;
                    col++;
                }
            } else {
                // Odd diagonal → move down (↙)
                int col = Math.min(i, m - 1);
                int row = i - col;
                while (row < n && col >= 0) {
                    System.out.print(matrix[row][col] + " ");
                    row++;
                    col--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printZigZag(matrix);
    }
}