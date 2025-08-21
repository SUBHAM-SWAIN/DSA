package Heap;

import java.util.ArrayList;

public class Heap_Operations {
    static class heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int x = arr.size() - 1; // index of the newly added element
            int par = (x - 1) / 2;

            while (x > 0 && arr.get(x) < arr.get(par)) {
                // swap child and parent
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                // move up
                x = par;
                par = (x - 1) / 2;
            }

        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int idx) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int smallest = idx;

            if (left < arr.size() && arr.get(left) < arr.get(smallest)) {
                smallest = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(smallest)) {
                smallest = right;
            }

            if (smallest != idx) {
                // swap
                int temp = arr.get(idx);
                arr.set(idx, arr.get(smallest));
                arr.set(smallest, temp);

                // heapify the affected subtree
                heapify(smallest);
            }
        }

        public int remove() {
            int data = arr.get(0);
            // swap first and last element
            arr.set(0, arr.get(arr.size() - 1));
            // remove last element
            arr.remove(arr.size() - 1);
            // heapify the root
            heapify(0);
            return data;

        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

    }

    public static void main(String[] args) {
        heap h = new heap();
        h.add(5);
        h.add(3);
        h.add(8);
        h.add(1);
        h.add(7);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }

        // // Example of using the heap with a custom class
        // Heap.Priority_Queue.Student s1 = new Heap.Priority_Queue.Student("Alice", 2);
        // Heap.Priority_Queue.Student s2 = new Heap.Priority_Queue.Student("Bob", 1);
        // Heap.Priority_Queue.Student s3 = new Heap.Priority_Queue.Student("Charlie",
        // 3);

        // PriorityQueue<Heap.Priority_Queue.Student> pq = new PriorityQueue<>();
        // pq.add(s1);
        // pq.add(s2);
        // pq.add(s3);

        // while (!pq.isEmpty()) {
        // System.out.println(pq.peek().Name + " " + pq.peek().rank);
        // pq.remove();
        // }
    }
}
