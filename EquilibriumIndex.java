import static java.nio.file.Files.find;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int a[]={3,4,9,7};
        System.out.println(find(a));
    }
    public static int find(int a[]){
        int totalSum=0,leftSum=0;
        for(int num:a)
            totalSum+=num;
        for(int i=0;i<a.length;i++){
            totalSum-=a[i];
            if(totalSum==leftSum)
                return i;
            leftSum+=a[i];
        }
        return -1;
    }
}
