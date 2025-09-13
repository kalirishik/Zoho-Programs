public class LeadersArray {
    public static void main(String[] args) {
        int a[]={16,17,4,3,5,2};
        int max=0;
        StringBuffer sb=new StringBuffer();
        for(int i=a.length-1;i>=0;i--){
            if(max<a[i]){
                max=a[i];
                sb.insert(0,max+" ");
            }
        }
        System.out.println(sb);
    }
}
