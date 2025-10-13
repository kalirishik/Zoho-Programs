//    Given an array of integers, compute the maximum value for each integer in the index,
//    by either summing all the digits or multiplying all the digits.
//            (Choose which operation gives the maximum value)
//            •	Input:
//            •	5
//            •	120 24 71 10 59
//            •	Output:
//            •	3 8 8 1 45
//    Explanation: For index 0, the integer is 120.
//    Summing the digits will give 3, and whereas
//    Multiplying the digits gives 0. Thus, maximum of this two is 3.
public class MaxSumOrMultipleArray {
    static int findSum(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    static int findMultiple(int num){
        int sum=1;
        while(num!=0){
            sum*=num%10;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        int a[]={120,24,71,10,59};
        int maxV=0;
        for(int i=0;i<n;i++){
            maxV=Math.max(findSum(a[i]),findMultiple(a[i]));
            System.out.print(maxV+" ");
        }
    }
}
