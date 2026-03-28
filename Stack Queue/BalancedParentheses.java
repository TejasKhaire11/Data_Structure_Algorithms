
import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String expr) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {

            char ch = expr.charAt(i);

            // Step 1: Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Step 2: Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                // If stack is empty, no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Step 3: Match pairs
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Step 4: If stack empty → balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String expr = "{[(()))]}";

        if (isBalanced(expr)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
