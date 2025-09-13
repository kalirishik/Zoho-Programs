public class SecondLargestNumArray {
    public static void main(String[] args) {
        int a1[]={5,5,5};
        int a2[]={};
        int a3[]={4,5,3,1,2};
        int a4[]={5,5,3};
        find(a1);
        find(a2);
        find(a3);
        find(a4);
    }
    public static void find(int arr[]){
        int n=arr.length;
        if(n==1 || n==0)
            System.out.println(-1);
        else{
            int largest=Integer.MIN_VALUE,secondLargest=Integer.MIN_VALUE;
            for(int num:arr){
                if(largest<num){
                    secondLargest=largest;
                    largest=num;
                }
                else if(secondLargest<num && num!=largest){
                    secondLargest=num;
                }
            }
            System.out.println(secondLargest);
        }

    }
}
