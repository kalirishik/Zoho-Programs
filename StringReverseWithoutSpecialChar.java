import java.util.Scanner;
public class StringReverseWithoutSpecialChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int left=0,right=str.length()-1;
        while(left<right){
            if(!Character.isLetter(ch[left]))
                left++;
            else if(!Character.isLetter(ch[right]))
                right--;
            else{
                char c=ch[left];
                ch[left]=ch[right];
                ch[right]=c;
                left++;
                right--;
            }
        }
        System.out.println(new String(ch));
    }
}
