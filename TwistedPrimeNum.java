public class TwistedPrimeNum {
    public static void main(String[] args) {
        int n=97;
        System.out.println((isPrime(n) && isPrime(reverseNum(n)))?
                "Twisted Prime Number":"Non Twisted Prime Number");
    }
    public static boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2;i<num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static int reverseNum(int num){
        int res=0;
        while(num!=0){
            int r=num%10;
            res=(res*10)+r;
            num/=10;
        }
        return res;
    }
}
