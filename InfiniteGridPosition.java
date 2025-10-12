//    Assume there exists infinite grid, you’re given initial position x, y. Inputs will be movements either L or R or U or D. After n inputs, you need to give the current position.
//    Input:
//            4 5 //initial position x, y
//            9 //number of movements
//            U L R R D D U L R //7 movements
//    Output: 5 5
public class InfiniteGridPosition {
    public static void main(String[] args) {
        // 🔹 Default input
        int x = 4, y = 5; // initial position
        int n = 9; // number of movements
        char[] moves = {'U', 'L', 'R', 'R', 'D', 'D', 'U', 'L', 'R'};

        // 🔹 Process each movement
        for (int i = 0; i < n; i++) {
            switch (moves[i]) {
                case 'U': y++; break;
                case 'D': y--; break;
                case 'L': x--; break;
                case 'R': x++; break;
            }
        }

        // 🔹 Output final position
        System.out.println(x + " " + y);
    }
}

