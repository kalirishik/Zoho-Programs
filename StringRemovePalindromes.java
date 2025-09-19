public class StringRemovePalindromes {
    public static void main(String[] args) {
        String words[]={"he","did","a","good","deed"};
        for(String word:words){
            if(!isPalindrome(word))
                System.out.print(word+" ");
        }
    }
    public static boolean isPalindrome(String str){
        int left=0,right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
