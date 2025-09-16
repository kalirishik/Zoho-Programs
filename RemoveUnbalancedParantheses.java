import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RemoveUnbalancedParantheses {
    public static void main(String[] args) {
        String str="(((abc)x";
        check(str);
    }
    static void check(String str){
        StringBuffer result=new StringBuffer();
        Stack<Integer> st=new Stack<>();
        Set<Integer> removeIndices= new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(')
                st.push(i);
            else if(ch==')'){
                if(st.isEmpty())
                    removeIndices.add(i);
                else
                    st.pop();
            }
        }
        while(!st.isEmpty())
            removeIndices.add(st.pop());
        for(int i=0;i<str.length();i++){
            if(!removeIndices.contains(i))
                result.append(str.charAt(i));
        }
        System.out.println(result);
    }
}
