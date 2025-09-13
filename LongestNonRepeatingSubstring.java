public class LongestNonRepeatingSubstring {
    public static void main(String[] args) {
        String s="ababcdefabcyuiabcdui";
        int lastSeen[]=new int[256];
        int maxLen=0,start=0;
        for(int i=0;i<s.length();i++){
            char currentChar=s.charAt(i);
            if(lastSeen[currentChar]>start){
                start=lastSeen[currentChar];
            }
            lastSeen[currentChar]=i+1;
            maxLen=Math.max(maxLen,i+1-start);
        }
        System.out.println(maxLen);
    }
}
