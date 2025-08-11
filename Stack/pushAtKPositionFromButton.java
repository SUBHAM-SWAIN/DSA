package Stack;

import java.util.*;

public class pushAtKPositionFromButton {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(5);
        s.push(2);
        s.push(10);
        s.push(8);
        int n = s.size();
        int k = 3;
        int num = 45;
        int i = 1;
        Stack<Integer> temp = new Stack<>();

        while (!s.isEmpty() && i <= (n - k + 1)) {
            int top = s.pop();
            temp.push(top);
            i++;
        }
        s.push(num);
        while (!temp.isEmpty()) {
            int top = temp.pop();
            s.push(top);

        }

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}
