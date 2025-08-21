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
