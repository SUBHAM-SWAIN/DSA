package Stack;

import java.util.*;

//reverse string using stack
public class reverseString {
    public static StringBuilder reverse(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            s.push(str.charAt(i));
            i++;

        }
        StringBuilder rev = new StringBuilder();
        while (!s.isEmpty()) {
            rev = rev.append(s.pop());
        }
        return rev;
    }

    public static void main(String[] args) {
        String str = "SUBHA";
        System.out.println(reverse(str));
    }

}
