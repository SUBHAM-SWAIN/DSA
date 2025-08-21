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
    }

    public static void main(String[] args) {

    }
}
