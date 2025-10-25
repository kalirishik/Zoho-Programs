import java.util.Arrays;
public class ArraySortColors {
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
//        int arr[]={2,2,1,0,0,0};
//        findOrderingColors(arr,arr.length);
//        System.out.println(Arrays.toString(arr));
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void findOrderingColors(int nums[],int n){

        int[] colors = new int[3];
        for(int i = 0; i < nums.length; i++){
            colors[nums[i]]++;
        }

        for(int i = 0; i < nums.length; i++){
            if(colors[0] > 0){
                nums[i] = 0;
                colors[0]--;
            } else if(colors[1] > 0){
                nums[i] = 1;
                colors[1]--;
            } else{
                nums[i] = 2;
                colors[2]--;
            }
        }
    }
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

