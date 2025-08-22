import java.util.*;

class Solution {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int dis;
        int idx;

        Point(int x, int y, int dis, int idx) {
            this.x = x;
            this.y = y;
            this.dis = dis;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.dis - p2.dis;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>();

        // calculate distance and push into min-heap
        for (int i = 0; i < points.length; i++) {
            int sqDis = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            pq.add(new Point(points[i][0], points[i][1], sqDis, i));
        }

        int[][] res = new int[k][2];

        // extract k closest points
        for (int i = 0; i < k; i++) {
            Point p = pq.remove();
            res[i][0] = p.x;
            res[i][1] = p.y;
        }

        return res;
    }
}
