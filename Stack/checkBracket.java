package Stack;

import java.util.*;

public class checkBracket {
    public static boolean checkBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']') ||
                (opening == '(' && closing == ')');
    }

    public static void main(String[] args) {
        String str = "{}[]()";
        System.out.println(checkBalanced(str));
    }

}
