import java.util.Scanner;

public class CharFreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        findFreq(s.toLowerCase());
    }
    public static void findFreq(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            int count=1;
            while(i+1< s.length() && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            res+=s.charAt(i)+""+count;
        }
        System.out.println(res);
    }
}
