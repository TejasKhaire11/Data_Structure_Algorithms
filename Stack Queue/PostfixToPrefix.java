import java.util.Stack;

public class PostfixToPrefix {

    static String convert(String postfix) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {

            char ch = postfix.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            }

            // Operator
            else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();

                String expression = ch + operand1 + operand2;
                stack.push(expression);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String postfix = "AB+C*";
        System.out.println("Prefix: " + convert(postfix));
    }
}
