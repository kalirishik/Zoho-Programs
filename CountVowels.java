import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        findVowel(s.toLowerCase());
    }
    public static void findVowel(String s){
        String vowel="aeiou";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(vowel.contains(s.charAt(i)+""))
                count++;
        }
        System.out.println(count);
    }
}
