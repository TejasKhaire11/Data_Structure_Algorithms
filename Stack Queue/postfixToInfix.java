
    
    import java.util.Stack;

public class postfixToInfix {

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

                String expression = "(" + operand1 + ch + operand2 + ")";
                stack.push(expression);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String postfix = "AB+C*";
        System.out.println("Infix: " + convert(postfix));
    }
}


