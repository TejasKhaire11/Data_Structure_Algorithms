import java.util.Stack;

public class prefixTopostfix {

    static String convert(String prefix) {

        Stack<String> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {

            char ch = prefix.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            }

            // Operator
            else {
                String operand1 = stack.pop();
                String operand2 = stack.pop();

                String expression = operand1 + operand2 + ch;
                stack.push(expression);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String prefix = "*+AB-CD";
        System.out.println("Postfix: " + convert(prefix));
    }
}
