public class UniqueNumArray {
    public static void main(String[] args) {
        int a[]={2,2,3,4,4,3};
        int xor=0;
        for(int num:a)
            xor^=num;
        System.out.println(xor);
    }
}
