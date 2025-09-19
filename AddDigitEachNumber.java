import java.util.Scanner;

public class AddDigitEachNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int digit=sc.nextInt();
        int temp=num;
        String result="";
        while(temp>0){
            int currentDigit=temp%10;
            int newDigit=currentDigit+digit;
            if(newDigit>=10){
                result=(newDigit%10)+result;
                result=(newDigit/10)+result;
            }
            else
                result=newDigit+result;
            temp/=10;
        }
        System.out.println(result);
    }
}
