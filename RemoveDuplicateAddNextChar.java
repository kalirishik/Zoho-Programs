//
//    Remove the duplicates in the String.
//    Testcase 1:
//    Input: Java1234
//    Output: Javb1234 (Remove the second ‘a’ as it is duplicated)
//    Testcase 2:
//    Input: Python1223:
//    Output: Python1234 (Replace the second 2 with 3, and replace 3 with 4 as 3 is replaced for the duplicated 2)
//    Testcase 3:
//    Input: aBuzZ9900
//    Output: aBuzC9012
//            (Replace the second ‘Z’ with ‘C’ as ‘a’ and ‘B’ are already there in the String.
//                    Replace with capital C as the letter to be replaced is capital Z.
//                    The second 9 turns out to be zero and the zero turns out to ‘1’ and
//                    the second zero turns out to ‘2’)

public class RemoveDuplicateAddNextChar{
    public static void main(String[] args) {
        String[] inputs = {"Java1234", "Python1223", "aBuzZ9900"};
        for (String input : inputs) {
            System.out.println("Input: " + input);
            System.out.println("Output: " + removeDuplicates(input));
            System.out.println();
        }
    }

    public static String removeDuplicates(String s) {
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        boolean[] digit = new boolean[10];
        StringBuilder res = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                int i = c - 'a';
                if (!lower[i]) lower[i] = true;
                else c = nextUnused(lower, 'a');
            } else if (Character.isUpperCase(c)) {
                int i = c - 'A';
                if (!upper[i]) upper[i] = true;
                else c = nextUnused(upper, 'A');
            } else if (Character.isDigit(c)) {
                int i = c - '0';
                if (!digit[i]) digit[i] = true;
                else c = nextUnused(digit, '0');
            }
            res.append(c);
        }
        return res.toString();
    }

    private static char nextUnused(boolean[] seen, char base) {
        for (int i = 0; i < seen.length; i++) {
            if (!seen[i]) {
                seen[i] = true;
                return (char) (base + i);
            }
        }
        return base; // fallback (shouldn’t occur)
    }
}
