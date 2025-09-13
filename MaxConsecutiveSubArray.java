public class MaxConsecutiveSubArray {
    public static void main(String[] args) {
        int a[]={1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int n=a.length,curLength=1,maxLength=0;
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1])
                curLength++;
            else{
                maxLength=Math.max(curLength,maxLength);
                curLength=1;
            }
        }
        maxLength=Math.max(curLength,maxLength);
        System.out.println(maxLength);
    }
}
