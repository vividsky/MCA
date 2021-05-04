import ADT.Stack;

/**Infix to Postfix Expression:
 * 4+((3^2)*6)+(5/9)
 * 432^6*+59/+
 */
public class Expressions {
    public static void main(String[] args) throws Exception {

        String infixExp = "4 + 3 ^ 2 * 6 + 5 / 9";
        String postfixExp = "4 3 2 ^ 6 * + 5 9 / +";
        System.out.println("Infix Expression:\n" + "4 + 3 ^ 2 * 6 + 5 / 9");
        System.out.println("Infix to Postfix Expression:\n" + infixToPostfix(infixExp));
        System.out.println("Solving Postfix Expression:\n" + solvePostfix(postfixExp));
    }
    public static int precedence(String ele) {
        return switch(ele) {
            case "+", "-" -> 1;
            case "*", "/" -> 2;
            case "^" -> 3;
            default -> 0;
        };
    }
    public static String infixToPostfix(String infixExp) throws Exception {
        String[] infix = infixExp.split(" ");
        Stack<String> stack = new Stack<String>();
        String postfix = "";
        for (String ele  : infix) {
            if (ele.equals("+") || ele.equals("-") || ele.equals("*") || ele.equals("/") || ele.equals("^")) {
                while (!stack.isEmpty() && precedence(ele) <= precedence(stack.peek())) {
                    postfix += stack.pop() + " ";
                }
                stack.push(ele);
            } else
                postfix += ele + " ";
        }
        while (!stack.isEmpty()) {
            postfix += stack.pop() + " ";
        }
        return postfix;
    }
    public static double solvePostfix(String postfixExp) throws Exception {

        String[] postfix = postfixExp.split(" ");
        Stack<String> stack = new Stack<String>();

        for (String ele : postfix) {

            if (ele.equals("+") || ele.equals("-") || ele.equals("*") || ele.equals("/") || ele.equals("^")) {

                double ele2 = Double.valueOf(stack.pop());
                double ele1 = Double.valueOf(stack.pop());

                switch(ele) {
                    case "+": stack.push(String.valueOf(ele1 + ele2));
                        break;
                    case "-": stack.push(String.valueOf(ele1 - ele2));
                        break;
                    case "*": stack.push(String.valueOf(ele1 * ele2));
                        break;
                    case "/": stack.push(String.valueOf(ele1 / ele2));
                        break;
                    case "^": stack.push(String.valueOf(Math.pow(ele1, ele2)));
                        break;
                }
            } else stack.push(ele);
        } return Double.valueOf(stack.pop());
    }
}
