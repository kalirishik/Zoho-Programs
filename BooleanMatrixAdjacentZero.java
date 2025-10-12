//    Given a Boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 then make its adjacent cells as 0.
//    Input:
//            1 0 1
//            0 1 0
//            1 1 1
//    Output:
//            0 0 0
//            0 0 0
//            1 0 1
//    Explanation:
//    For the cell mat[0][0] which is 1, its adjacent cells (mat[0][1] and mat[1][0]) are modified to 0.
//    For the cell mat[1][1] which is 1, its adjacent cells (mat[0][1], mat[1][0], mat[1][2], and mat[2][1]) are modified to 0.
//    The modification is not applied to the cell mat[2][2] as it doesn't have all four adjacent cells.
public class BooleanMatrixAdjacentZero {
    static void modifyMatrix(int[][] mat, int M, int N) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // First pass: mark adjacent cells of 1 with -1 (if not 1)
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == 1) {
                    for (int d = 0; d < 4; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];
                        if (ni >= 0 && ni < M && nj >= 0 && nj < N && mat[ni][nj] != 1) {
                            mat[ni][nj] = -1; // mark for zeroing
                        }
                    }
                }
            }
        }

        // Second pass: convert all markers (-1) to 0
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
            }
        }
    }
    public static void modifyMatrix(int[][] mat) {
        int M = mat.length;
        int N = mat[0].length;

        // Create a copy to track cells that should become 0
        boolean[][] toZero = new boolean[M][N];

        // First pass: mark adjacent cells of 1's
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == 1) {
                    // Up
                    if (i - 1 >= 0) toZero[i - 1][j] = true;
                    // Down
                    if (i + 1 < M) toZero[i + 1][j] = true;
                    // Left
                    if (j - 1 >= 0) toZero[i][j - 1] = true;
                    // Right
                    if (j + 1 < N) toZero[i][j + 1] = true;
                }
            }
        }

        // Second pass: update the matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (toZero[i][j]) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 1, 1}
        };

        modifyMatrix(mat, 3, 3);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

