import java.util.Scanner;

//Version Comparison Problem
//
//Given two version strings, compare them and return:
//        - 0 → if versions are equal
//- 1 → if  version !=
//
//Input: "1.0.0", "1.0"
//Output: 0
//Explanation: Both represent the same version.
//
//        Input: "1.001", "1.01"
//Output: 0
//Explanation: Leading zeros are ignored; both are equal.
//
//        Input: "1.1", "1.0"
//Output: 1
//Explanation: First version is greater than the second.
public class VersionComparisonProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1[]=sc.nextLine().split("\\.");
        String str2[]=sc.nextLine().split("\\.");
        int maxLength=Math.max(str1.length,str2.length);
        System.out.println(findVersionCompariosn(str1,str2,maxLength));
    }
    public static int findVersionCompariosn(String[] str1,String[] str2, int maxLength){
        for(int i=0;i<maxLength;i++){
            int version1=i<str1.length?Integer.parseInt(str1[i]):0;
            int version2=i<str2.length?Integer.parseInt(str2[i]):0;
            if(version1>version2)
                return 1;
            else if(version1<version2)
                return -1;
        }
        return 0;
    }
}
