public class BinarySum {
    public static void main(String[] args) {
        String s1="10011"; // 11
        String s2="11000"; // 24
        int sum=Integer.parseInt(s1,2)+Integer.parseInt(s2,2);
        System.out.println(sum);
        System.out.println(Integer.toBinaryString(sum));
    }
}
