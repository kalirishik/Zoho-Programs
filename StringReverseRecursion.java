import java.util.Scanner;

public class StringReverseRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println(reverse(str1));
    }
    public static String reverse(String str){
        if(str==null || str.isEmpty())
            return str;
        int spaceIndex=str.indexOf(' ');
        if(spaceIndex==-1)
            return str;
        String firstWord=str.substring(0,spaceIndex);
        String secondWord=str.substring(spaceIndex+1);
        return reverse(secondWord)+" "+firstWord;
    }
}
