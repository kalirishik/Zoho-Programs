import java.util.Stack;

public class ExpressionValidity {
    public static void main(String[] args) {
        String str1 = "(a+b)*c";
        String str2 = "(ab)(ab++)";
        System.out.println(check(str1) ? "Valid" : "Invalid");
        System.out.println(check(str2) ? "Valid" : "Invalid");
    }

    public static boolean check(String str) {
        Stack<Character> stack = new Stack<>();
        char prev = ' ';

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                if (stack.isEmpty() || isOperator(prev)) return false;
                stack.pop();
            }
            else if (isOperator(ch)) {
                if (prev == ' ' || prev == '(' || isOperator(prev)) return false;
            }
            prev = ch;
        }

        return stack.isEmpty() && !isOperator(prev);
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}
