
package greedy;
import java.util.*;

public class insertintervals {
    public static void main(String[] args) {
        // 1) List -> Array
        System.out.print(Arrays.toString(insert(new int[][]{{1,3},{6,9}},new int[]{2,5})));
    }
    static int[][] insert(int[][] intervals, int[] newInterval) {
       List<int[]> answer=new ArrayList<>();
       int i=0;
       int n=intervals.length;
       while(i<n && intervals[i][1]<newInterval[0]){
        answer.add(intervals[i]);
        i++;
       }
       ///Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
       /// Output: [[1,5],[6,9]]
       while(i<n && intervals[i][0]<newInterval[1]){
        newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
        newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
        i++;
       }
       answer.add(newInterval);
       while(i<n){
        answer.add(intervals[i]);
        i++;
       }

return answer.toArray(new int[answer.size()][]);
    }
}