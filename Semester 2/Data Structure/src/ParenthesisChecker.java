package ADT;
import ADT.Stack;
import java.util.*;

public class ParenthesisChecker {
    public static void main(String[] args) throws Exception {
        String s = "(a + b)*x)";
        boolean value = check_bal_parenthesis(s);
        System.out.println(value);
    }
    public static boolean check_bal_parenthesis(String s) throws Exception {
        //Converting String s into character Array
        char[] charArr = s.toCharArray();
        //Creating Stack ADT
        Stack<Character> stack = new Stack<Character>();
        for (char ele : charArr) {
            // If ele is other than parenthesis then do nothing
            if (ele != '[' && ele != '{' && ele != '(' && ele != ']' && ele != '}' && ele != ')') {}
            // If ele is [ { ( then push it into stack
            else if (ele == '[' || ele == '{' || ele == '(') {
                stack.push(ele);
            }
            //return false if stack is empty
            else {
                if (stack.isEmpty() == true) {
                    return false;
                }
                // If ele is ] } ) then pop out the top element from stack and compare, return false if found not found perfect match
                else {
                    char val = stack.pop();
                    if (ele == ']' && val != '[') return false;
                    if (ele == ')' && val != '(') return false;
                    if (ele == '}' && val != '{') return false;
                }
            }
        }
        //if opening parenthesis are more then closing parenthesis, return false
        if (!stack.isEmpty()) return false;
        //Else, return true
        return true;
    }
}
