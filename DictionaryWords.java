//    Given an input string and a dictionary of words,
//    find out if the input string can be segmented into a space-separated sequence of dictionary words.
//    See following examples for more details.
//    Consider the following dictionary
//    { i, like, sam, sung, samsung, mobile, ice,
//    cream, icecream, man, go, mango}
//
//    Input:  ilike
//    Output: Yes
//    The string can be segmented as "i like".
//
//    Input:  ilikesamsung
//    Output: Yes
//    The string can be segmented as "i like samsung"
//    or "i like sam sung".

import java.util.*;
public class DictionaryWords {

    // Recursive method to check if string can be segmented
    public static boolean canSegment(String s, Set<String> dict) {
        // Base case: empty string
        if (s.isEmpty()) return true;

        // Try all prefixes
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (dict.contains(prefix) && canSegment(s.substring(i), dict)) {
                return true;
            }
        }
        return false;
    }

    // Recursive method to print one valid segmentation
    public static boolean printSegmentation(String s, Set<String> dict, List<String> result) {
        if (s.isEmpty()) return true;

        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (dict.contains(prefix)) {
                result.add(prefix);
                if (printSegmentation(s.substring(i), dict, result)) return true;
                result.remove(result.size() - 1); // backtrack
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Set<String> dict = new HashSet<>(Arrays.asList(
                "i", "like", "sam", "sung", "samsung", "mobile", "ice",
                "cream", "icecream", "man", "go", "mango"
        ));

        String s1 = "ilike";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + (canSegment(s1, dict) ? "Yes" : "No"));
        if (canSegment(s1, dict)) {
            List<String> result = new ArrayList<>();
            printSegmentation(s1, dict, result);
            System.out.println(String.join(" ", result));
        }

        System.out.println();

        String s2 = "ilikesamsung";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + (canSegment(s2, dict) ? "Yes" : "No"));
        if (canSegment(s2, dict)) {
            List<String> result = new ArrayList<>();
            printSegmentation(s2, dict, result);
            System.out.println(String.join(" ", result));
        }
    }
}

