package Queue;

import java.util.*;

public class QueueUsingTwoStacks {
    public static class Queue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        public boolean isEmpty() {
            return stack1.isEmpty();
        }

        public void add(int data) {
            // Move everything from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            // Push new data to stack1
            stack1.push(data);

            // Move everything back
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return stack1.pop();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return stack1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
