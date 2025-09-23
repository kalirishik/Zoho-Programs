//(no regex)
//Input:
//s1 : abccabb
//s2 : b*ab+
//Output: bccabb
//   * → 0 or more occurrences.
//   + → 1 or more occurrences.


public class StringPatternMatcher {
    public static void main(String[] args) {
        String s1 = "abccabb";
        String s2 = "b*ab+";
        String output = matchPattern(s1, s2);
        System.out.println(output); // bccabb
    }
    public static String matchPattern(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        for (int start = 0; start < n; start++) {
            int i = start;
            int j = 0;
            int matchEnd = -1; // To track the end of a potential match
            boolean patternMatch = true;
            int currentTextIndex = start;
            while (j < m) {
                if (currentTextIndex > n) {
                    patternMatch = false;
                    break;
                }
                char p = pattern.charAt(j);
                if (j + 1 < m && pattern.charAt(j + 1) == '*') {
                    char prevChar = p;
                    // Skip all occurrences of prevChar in text. This is greedy.
                    while (currentTextIndex < n && text.charAt(currentTextIndex) == prevChar) {
                        currentTextIndex++;
                    }
                    j += 2;
                } else if (j + 1 < m && pattern.charAt(j + 1) == '+') {
                    char prevChar = p;
                    // Must match at least one
                    if (currentTextIndex >= n || text.charAt(currentTextIndex) != prevChar) {
                        patternMatch = false;
                        break;
                    }
                    currentTextIndex++; // Match the first one
                    // Match subsequent ones
                    while (currentTextIndex < n && text.charAt(currentTextIndex) == prevChar) {
                        currentTextIndex++;
                    }
                    j += 2;
                } else {
                    // Normal character match
                    if (currentTextIndex < n && text.charAt(currentTextIndex) == p) {
                        currentTextIndex++;
                        j++;
                    } else {
                        patternMatch = false;
                        break;
                    }
                }
                // Update the end of the match
                if (patternMatch) {
                    matchEnd = currentTextIndex;
                }
            }
            if (j == m && patternMatch) {
                return text.substring(start, matchEnd);
            }
        }
        return "";
    }
}




