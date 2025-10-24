//Given N. print the Latin Matrix (say N = 3). condition:
//must not use strings(aka character literals), arrays (both 1D and 2D), inbuilt functions(like rotate).
//A   B   C
//B   C   A
//C   A   B
public class LatinMatrix {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<n;i++){
            char ch=(char)('A'+i);
            for(int j=0;j<n;j++){
                System.out.print(ch+" ");
                ch++;
                if(ch>'A'+n-1)
                    ch='A';
            }
            System.out.println();
        }
    }
}
