public class PseudoBinary {
    public static void main(String[] args) {
        int n=31;
        // O(n2)
        int count=0;
        while(n>0){
            int temp=n,place=1,pseudo=0;
            while(temp>0){
                int digit=temp%10;
                if(digit>0) pseudo+=place;
                temp/=10;
                place*=10;
            }
            n-=pseudo;
            count++;
        }
        System.out.println(count);
        // O(n)
        int num=44;
        int maxDigit=0;
        while(num>0){
            int temp=num%10;
            maxDigit=Math.max(maxDigit,temp);
            num/=10;
        }
        System.out.println(maxDigit);
    }
}
