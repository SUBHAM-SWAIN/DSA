package Queue;

import java.util.*;

public class fstNonRepeting {

    public static char firstNonRepeating(String str) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
            q.add(ch);

        }
        while (!q.isEmpty()) {
            if (freq[q.peek() - 'a'] == 1) {
                return q.peek();
            } else {
                q.remove();
            }

        }
        return '#'; // If no non-repeating character found

    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(firstNonRepeating(str));

    }
}
