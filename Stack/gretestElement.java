package Stack;

import java.util.*;

public class gretestElement {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 1, 8, 2, 5, 7 };
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = s.peek();
            }
            s.push(arr[i]);

        }

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.println("Next greater element of " + arr[i] + " is: " + nextGreater[i]);
        }

    }
}
