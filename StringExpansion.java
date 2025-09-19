import java.util.Arrays;
import java.util.Scanner;

public class StringExpansion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
//        String number[]=str.replaceAll("[^0-9]"," ").trim().split(" ");
//        String ch[]=str.replaceAll("[0-9]"," ").trim().split(" ");
//        int n=str.length();
//        for(int i=0;i<ch.length;i++){
//            for(int j=0;j<Integer.parseInt(number[i]);j++)
//                System.out.print(ch[i]);
//        }
        int n=str.length();
        String res="";
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int number=0;
            while(i+1<n && Character.isDigit(str.charAt(i+1))){
                number=number*10+(str.charAt(i+1)-'0');
                i++;
            }
            for(int j=0;j<number;j++)
                res+=ch;
        }
        System.out.println(res);
    }
}
