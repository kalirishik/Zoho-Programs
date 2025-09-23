//Input: a1b2c4aab12d
//Output: abc412d
//- If it is a character, then take the first occurrence and omit the others.
//- If it is a digit, then take the last occurrence.
//- (No built-in methods like char.isDigit(), na ASCII value use panen).

import java.util.Arrays;

public class FirstCharLastDigit {
    public static void main(String[] args) {
        String input = "a1b2c4aab12d";
        StringBuilder result = new StringBuilder();

        // Step 1: find last occurrence of each digit
        int[] lastDigitIndex = new int[10];
        for (int i = 0; i < 10; i++) lastDigitIndex[i] = -1;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                lastDigitIndex[ch - '0'] = i;
            }
        }

        // Step 2: build result
        boolean[] charSeen = new boolean[256];  // track seen letters

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If alphabet (ASCII check)
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (!charSeen[ch]) {
                    result.append(ch);
                    charSeen[ch] = true;
                }
            }
            // If digit (ASCII check)
            else if (ch >= '0' && ch <= '9') {
                int d = ch - '0';
                if (i == lastDigitIndex[d]) {
                    result.append(ch);
                }
            }
        }

        System.out.println("Output: " + result.toString());
        System.out.println(Arrays.toString(lastDigitIndex));
    }
}
