//    Reverse the words in the given String1 from the first occurrence of String2 in String1 by maintaining white Spaces.
//            example: String1 = Input: This is a test String only String2 = st Output: This is a only String test

public class StringReverseFirstOccurence {
    public static void main(String[] args) {
        String str1 = "This is a test String only";
        String str2 = "st";

        System.out.println("Input: " + str1);
        System.out.println("Substring: " + str2);
        System.out.println("Output: " + reverseFromSubstring(str1, str2));
    }

    public static String reverseFromSubstring(String str1, String str2) {
        String[] words = str1.split(" ");
        int startIndex = -1;

        // Find first word containing the substring
        for (int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().contains(str2.toLowerCase())) {
                startIndex = i;
                break;
            }
        }

        // If substring not found → return original string
        if (startIndex == -1) return str1;

        // Split into two parts
        StringBuilder result = new StringBuilder();

        // Add words before the substring word
        for (int i = 0; i < startIndex; i++) {
            result.append(words[i]).append(" ");
        }

        // Reverse words from that word till the end
        for (int i = words.length - 1; i >= startIndex; i--) {
            result.append(words[i]);
            if (i > startIndex) result.append(" ");
        }

        return result.toString().trim();
    }
}
