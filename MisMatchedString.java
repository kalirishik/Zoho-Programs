public class MisMatchedString {
    public static void main(String[] args) {
        String s1="schoollifeisusefull";
        String s2="schoollongofuselike";
        StringBuffer p1= new StringBuffer();
        StringBuffer p2= new StringBuffer();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                p1.append(s1.charAt(i));
                p2.append(s2.charAt(i));
            }
            else{
                if(p1.length()>0){
                    System.out.println(p1+" , "+p2);
                    p1.setLength(0);
                    p2.setLength(0);
                }
            }
        }
        if(p1.length()>0){
            System.out.println(p1+" , "+p2);
        }
    }
}
