public class SubsetArray {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5};
        int a2[]={2,4,5};
        System.out.println(find(a1,a2));
    }
    static boolean find(int a1[],int a2[]){
        int i=0,j=0,n1=a1.length,n2=a2.length;
        while(i<n1 && j<n2){
            if(a1[i]==a2[j]){
                i++;
                j++;
            }
            else if(a1[i]<a2[j])
                i++;
            else
                return false;
        }
        return j == n2;
    }
}
