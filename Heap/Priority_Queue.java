package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue {

    static class Student implements Comparable<Student> {
        String Name;
        int rank;

        Student(String Name, int rank) {
            this.Name = Name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student o) {
            return this.rank - o.rank; // Ascending order based on rank
        }

    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 1));
        pq.add(new Student("B", 12));
        pq.add(new Student("C", 4));
        pq.add(new Student("D", 45));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().Name + " " + pq.peek().rank);
            pq.remove();
        }
    }
}

// ..............................
class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        int cost = 0;
        while (pq.size() > 1) {
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost = cost + min1 + min2;
            pq.add(min1 + min2);
        }
        return cost;
    }
}

// ...................
class Solution {

    static class Row implements Comparable<Row> {
        int soldiers;
        int idx;

        Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldiers == r2.soldiers) {
                return this.idx - r2.idx;
            } else {
                return this.soldiers - r2.soldiers;
            }
        }

    }

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                count += mat[i][j];
            }
            pq.add(new Row(count, i));
        }

        int res[] = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.remove().idx;
        }
        return res;
    }
}
