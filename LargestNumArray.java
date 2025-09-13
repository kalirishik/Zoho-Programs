import java.util.Arrays;

public class LargestNumArray {
    public static void main(String[] args) {
//        int a[]={8,1,4,5,6,9};
//        int f[]=new int[10];
//        for(int num:a)
//            f[num]++;
//        for(int i=9;i>=0;i--){
//            if(f[i]!=0)
//                System.out.print(i);
//        }
        Integer a[] = {8, 1, 4, 5, 6, 9};
        Arrays.sort(a, (x, y) -> y.compareTo(x));
        System.out.println(Arrays.toString(a));

    }
}
