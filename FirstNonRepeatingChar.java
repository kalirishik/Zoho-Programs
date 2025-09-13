public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str1="kaalirishik";
        String str2="??//??//??%@%%%%";
        System.out.println(find(str1));
        System.out.println(find(str2));
    }
    public static Character find(String str){
        int freq[]=new int[256];
        for(int i=0;i<str.length();i++)
            freq[str.charAt(i)]++;
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)]==1)
                return str.charAt(i);
        }
        return null;
    }
}
