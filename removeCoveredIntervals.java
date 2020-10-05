package sol;


import java.util.Arrays;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        if(n == 1) {
            return 1;
        }
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);

        int count = 0, last = 0;
        for (int[] interval : intervals) {
            if(interval[1] > last) {
                last = interval[1];
                count++;
            }
        }
        return count;
    }
}