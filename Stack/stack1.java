package Stack;

//Stack implementation using array list
import java.util.ArrayList;

public class stack1 {
    static class Stack {
        static ArrayList<Integer> al = new ArrayList<>();

        // isEmpty
        public static Boolean isEmpty() {
            return al.size() == 0;
        }

        // push
        public static void push(int data) {
            al.add(data);

        }

        // pop
        public static int pop() {
            int data = al.get(al.size() - 1);
            al.remove(al.size() - 1);
            return data;
        }

        // peek
        public static int peek() {
            return al.get(al.size() - 1);
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }

    }

}
