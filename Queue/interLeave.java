package Queue;

import java.util.*;

public class interLeave {
    public static void interLeaveQueue(Queue<Integer> queue) {
        Queue<Integer> temp = new LinkedList<>();
        int halfSize = queue.size() / 2;

        // Step 1: Dequeue the first half of the queue and push it onto a temporary
        // stack
        for (int i = 0; i < halfSize; i++) {
            temp.add(queue.remove());
        }

        // Step 2: Interleave the elements
        while (!temp.isEmpty()) {
            queue.add(temp.remove());
            queue.add(queue.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        interLeaveQueue(queue);

        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");

        }

    }
}
