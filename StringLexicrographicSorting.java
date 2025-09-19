import java.util.Scanner;

public class StringLexicrographicSorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++)
            str[i]=sc.next();
        lexicrographicallyString(str,n);
        for(String word:str)
            System.out.print(word+" ");
    }
    public static void lexicrographicallyString(String str[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(compare(str[i],str[j])>0){
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
    }
    public static int compare(String s1,String s2){
        int minLength=Math.min(s1.length(),s2.length());
        for(int i=0;i<minLength;i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            if(c1!=c2)
                return c1-c2;
        }
        return s1.length() - s2.length();
    }
}
