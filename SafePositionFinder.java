//    There is a circular queue of processes. Every time there will be certain no of process skipped and a particular start position. Find the safe position.
//            Input: Number of process:5
//            Start position:3
//            Skip: 2nd
//            Output: 1 will be the safest position
//            (Logic: 1 2 3 4 5 starting from 3, 5th process will be skipped
//            1 2 3 4 5 process 2 will be skipped
//            1 2 3 4 5 process 4 will be skipped
//            1 2 3 4 5 process 3 will be skipped, so safest process is 1.

import java.util.ArrayList;
import java.util.List;

public class SafePositionFinder {

    public static int findSafePosition(int numProcesses, int startPosition, int skipK) {
        List<Integer> processes = new ArrayList<>();
        for (int i = 1; i <= numProcesses; i++) {
            processes.add(i);
        }

        int currentIndex = startPosition - 1;

        while (processes.size() > 1) {
            int removeIndex = (currentIndex + skipK) % processes.size();
            processes.remove(removeIndex);
            currentIndex = removeIndex % processes.size();
        }

        return processes.get(0);
    }

    public static void main(String[] args) {
        int numProcesses = 5;   // Number of processes
        int startPosition = 3;  // Start counting from process #3
        int skipK = 2;          // Eliminate every 2nd process

        int safePosition = findSafePosition(numProcesses, startPosition, skipK);
        System.out.println(safePosition + " will be the safest position"); // Output: 1
    }
}
