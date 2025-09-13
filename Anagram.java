public class Anagram {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="bded";
        System.out.println(find(s1,s2));
    }
    public static boolean find(String s1, String s2){
        int freq[]=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<s1.length();i++){
            if(freq[i]!=0)
                return false;
        }
        return true;
    }
}
