public class CheckStringRotation {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="bcda";
        System.out.println(find(s1,s2));
    }
    public static boolean find(String s1, String s2){
        return (s1+s1).contains(s2);
    }
}
