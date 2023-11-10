package ArrayQue;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Intervals {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }

        // Sort the intervals based on their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= currentInterval[1]) {
                // Overlapping intervals, update the end time of the current interval
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                // Non-overlapping interval, add the current interval to the result list
                result.add(currentInterval);
                currentInterval = intervals[i];
            }
        }

        // Add the last interval to the result list
        result.add(currentInterval);

        // Convert the list to a 2D array and return
        return result.toArray(new int[result.size()][]);

    }
}
