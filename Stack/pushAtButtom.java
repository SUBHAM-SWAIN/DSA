package Stack;

import java.util.*;

//push at bottom
public class stack4 {
    public static void pushButtom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushButtom(s, data);
        s.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushButtom(s, 5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
