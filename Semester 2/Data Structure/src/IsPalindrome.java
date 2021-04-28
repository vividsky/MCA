import ADT.GrowableStack;
public class IsPalindrome {
    public static void main(String[] args) {
        String message = "hello";
        char[] charArr = message.toCharArray();
        int length = message.length();
        GrowableStack stack = new GrowableStack();
        if (length%2 == 0) {
            for (int i = 0; i < length/2; i++) {
                stack.push(char[i]);
            }
        }
    }

}
