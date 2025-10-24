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
public class StringArrayDictionaryWords {
    // Dictionary of valid words
    static String[] dict = {
            "i", "like", "sam", "sung", "samsung", "mobile",
            "ice", "cream", "icecream", "man", "go", "mango"
    };

    public static void main(String[] args) {
        String input1 = "ilike";
        String input2 = "ilikesamsung";
        String input3 = "ilikemobile";

        System.out.println(input1 + " → " + (wordBreak(input1) ? "Yes" : "No"));
        System.out.println(input2 + " → " + (wordBreak(input2) ? "Yes" : "No"));
        System.out.println(input3 + " → " + (wordBreak(input3) ? "Yes" : "No"));
    }

    // Check if a word is in the dictionary
    static boolean contains(String word) {
        for (String w : dict) {
            if (w.equals(word))
                return true;
        }
        return false;
    }

    // Recursive function to check if string can be segmented
    static boolean wordBreak(String s) {
        int n = s.length();

        // Empty string = valid segmentation
        if (n == 0)
            return true;

        // Try all possible prefixes
        for (int i = 1; i <= n; i++) {
            String prefix = s.substring(0, i);
            String suffix = s.substring(i);

            // If prefix in dictionary and suffix can also be segmented
            if (contains(prefix) && wordBreak(suffix))
                return true;
        }
        return false;
    }
}


