//    Given a string, change the order of words in the string (last string should come first).
//    Should use RECURSION
//
//    Sample:   one two three
//    Output :  three two one


public class ReverseWordsRecursively {

    // Recursive function to reverse words
    public static String reverseWords(String str) {
        int spaceIndex = str.indexOf(" ");

        // Base case: no space means single word
        if (spaceIndex == -1)
            return str;

        // Get the first word and remaining string
        String firstWord = str.substring(0, spaceIndex);
        String remaining = str.substring(spaceIndex + 1);

        // Recursive call + combine
        return reverseWords(remaining) + " " + firstWord;
    }

    public static void main(String[] args) {
        String input = "one two three";
        String output = reverseWords(input);
        System.out.println(output); // Output: three two one
    }
}
