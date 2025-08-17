import java.util.*;

class Solution {
    public int activitySelection(int[] start, int[] finish) {

        int n = start.length;
        int[][] activity = new int[n][3];

        // store index, start, finish
        for (int i = 0; i < n; i++) {
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = finish[i];
        }

        // sort by finish time
        Arrays.sort(activity, Comparator.comparingInt(o -> o[2]));

        // select first activity
        int countAct = 1;
        int lastFinish = activity[0][2];

        for (int i = 1; i < n; i++) {
            if (activity[i][1] > lastFinish) {
                countAct++;
                lastFinish = activity[i][2];
            }
        }
        return countAct;
    }
}
