public class StringPalindrome {
    public static void main(String[] args) {
        String s1="abcba";
        String s2="abcb";
        String s3="ab@cb@a";
        System.out.println(find(s1));
        System.out.println(find(s2));
        System.out.println(find(s3));
    }
    public static boolean find(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            while(!Character.isAlphabetic(s.charAt(left)))
                left++;
            while(!Character.isAlphabetic(s.charAt(right)))
                right--;
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }

        }
        return true;
    }
}
