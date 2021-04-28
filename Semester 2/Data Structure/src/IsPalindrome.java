//import ADT.GrowableStack;

public class IsPalindrome {

    public static void main(String[] args) {
        String message = "abracadabra";
        System.out.println(checkPalindrome(message));
    }

    public static boolean checkPalindrome(String message) {
        int i = 0;
//        char[] charArr = message.toCharArray();
        int length = message.length();
        GrowableStack<Character> stack = new GrowableStack<Character>();
        for (;i < length/2; i++) {
            stack.push(message.charAt(i));
        }
        if (length%2 != 0) {
            i++;
        }
        for (; i<length; i++ ) {
            if (stack.pop() != message.charAt(i)) return false;
        }
        return true;
    }

}
