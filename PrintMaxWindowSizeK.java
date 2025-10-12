//    Given an array of numbers and a window of size k. Print the maximum of numbers inside the window for each step as the window moves from the beginning of the array.
//    INPUT  :
//
//    Enter the array size  :  8
//    Enter the elements  :  1,3,5,2,1,8,6,9
//    Enter the window size  :  3
//
//    OUTPUT  :
//
//            5 5 5 8 8 9
public class PrintMaxWindowSizeK {
    public static void main(String[] args) {
        int a[]={1,3,5,2,1,8,6,9};
        int k=3;
        int maxV=0, n=a.length;
        for(int i=0;i<=n-k;i++){
            maxV=a[i];
            for(int j=1;j<k;j++){
                if(a[i+j]>maxV)
                    maxV=a[i+j];
            }
            System.out.print(maxV+" ");
        }

    }
}
