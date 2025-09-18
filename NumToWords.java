import java.util.Scanner;

public class NumToWords {
    public static String[] ones={"","one","two","three","four","five",
            "six","seven","eight","nine"};
    public static String[] teens={"ten","elevan","twelve","thirteen","fourteen",
            "fifteen","sixteen","eighteen","nineteen"};
    public static String[] tens={"","","twenty","thirty","fourty","fifty","sixty",
            "seventy","eighty","ninety"};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // n= 0 - 999
        System.out.println(convert(n));
    }
    public static String convert(int num){
        if(num==0) return "zero";
        String words="";
        while(num>=100){
            words+=ones[num/100]+" Hundred";
            num%=100;
            if(num>0)
                words+=" and";
        }
        if(num>=20){
            words+=" "+tens[num/10];
            num%=10;
            if(num>0)
                words+=" "+ones[num];
        }
        else if(num>=10)
            words+=" "+teens[num-10];
        else if(num>0)
            words+=" "+ones[num];
        return words;
    }
}
