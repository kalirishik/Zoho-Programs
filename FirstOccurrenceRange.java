public class FirstOccurrenceRange {
    public static void main(String[] args) {
        String str1="ZOHOCORPORATION";
        String str2="PORT";
        int minIndex=Integer.MAX_VALUE,maxIndex=Integer.MIN_VALUE;
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(str1.indexOf(ch)!=-1){
                minIndex=Math.min(minIndex,str1.indexOf(ch));
                maxIndex=Math.max(maxIndex,str1.indexOf(ch));
            }
        }
        System.out.println(minIndex +" "+ maxIndex);
        System.out.println(str1.substring(minIndex,maxIndex+1));
    }
}
