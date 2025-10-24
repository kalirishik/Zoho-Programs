//    In MS-Paint, when we take the brush to a pixel and click, the color of the region of that pixel is replaced with a new selected color. Following is the problem statement to do this task.
//    Given a 2D screen, location of a pixel in the screen and a color, replace color of the given pixel and all adjacent same colored pixels with the given color.
//            Example:
//    Input:
//    screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
//            {1, 1, 1, 1, 1, 1, 0, 0},
//            {1, 0, 0, 1, 1, 0, 1, 1},
//            {1, 2, 2, 2, 2, 0, 1, 0},
//            {1, 1, 1, 2, 2, 0, 1, 0},
//            {1, 1, 1, 2, 2, 2, 2, 0},
//            {1, 1, 1, 1, 1, 2, 1, 1},
//            {1, 1, 1, 1, 1, 2, 2, 1},
//            };
//    x = 4, y = 4, newColor = 3
//    The values in the given 2D screen indicate colors of the pixels.
//    x and y are coordinates of the brush, newColor is the color that
//    should replace the previous color on screen[x][y] and all surrounding
//    pixels with same color.
//
//    Output:
//    Screen should be changed to following.
//    screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
//            {1, 1, 1, 1, 1, 1, 0, 0},
//            {1, 0, 0, 1, 1, 0, 1, 1},
//            {1, 3, 3, 3, 3, 0, 1, 0},
//            {1, 1, 1, 3, 3, 0, 1, 0},
//            {1, 1, 1, 3, 3, 3, 3, 0},
//            {1, 1, 1, 1, 1, 3, 1, 1},
//            {1, 1, 1, 1, 1, 3, 3, 1},
//            };

public class MatrixPixelColor {
    static int M = 8, N = 8;

    public static void main(String[] args) {
        int[][] screen = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };

        int x = 4, y = 4, newColor = 3;
        int prevColor = screen[x][y];  // get the original color

        floodFill(screen, x, y, prevColor, newColor);

        System.out.println("Updated Screen:");
        printMatrix(screen);
    }

    // Flood fill using recursion (DFS)
    static void floodFill(int[][] screen, int x, int y, int prevColor, int newColor) {
        // base conditions
        if (x < 0 || x >= M || y < 0 || y >= N) return;
        if (screen[x][y] != prevColor || screen[x][y] == newColor) return;

        // fill the color
        screen[x][y] = newColor;

        // recursive calls in all 4 directions
        floodFill(screen, x + 1, y, prevColor, newColor);
        floodFill(screen, x - 1, y, prevColor, newColor);
        floodFill(screen, x, y + 1, prevColor, newColor);
        floodFill(screen, x, y - 1, prevColor, newColor);
    }

    static void printMatrix(int[][] mat) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

