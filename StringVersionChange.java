//    Print whether the version is upgraded, downgraded or not changed according to the input given.
//    example: Input : Version1 4.8.2 Version2 4.8.4 Output: upgraded,
//    Input : Version1 4.0.2 Version2 4.8.4 Output: downgraded
public class StringVersionChange {
    public static void main(String[] args) {
        String v1[]="4.0.2".split("\\.");
        String v2[]="4.8.4".split("\\.");
        int maxLength=Math.max(v1.length,v2.length);
        System.out.println(find(v1,v2,maxLength));
    }
    public static String find(String[] v1,String[] v2,int length){
        for(int i=0;i<length;i++){
            int n1=i<v1.length?Integer.parseInt(v1[i]):0;
            int n2=i<v2.length?Integer.parseInt(v2[i]):0;
            if(n1<n2)
                return "upgraded";
            else
                return "downgraded";
        }
        return "not Changed";
    }
}
