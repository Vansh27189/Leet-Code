class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // insert position...  also keep adding elements before that
        // while overlapping...... update newinterval -> overlapping done
        // no overlapping...... add new interval there only
        // insert remanining elements in list





        int i = 0;
        List <int[]> list = new ArrayList<>();
        
        while(i<intervals.length && newInterval[0]>intervals[i][1]){
            list.add(intervals[i]);
            i++;
        }
        while(i<intervals.length && intervals[i][1]>=newInterval[0] & newInterval[1]>=intervals[i][0]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;

        }

        list.add(newInterval);

        while(i<intervals.length){
            list.add(intervals[i]);
            i++;
        }

        int[][] arr = new int[list.size()][2];

        for(int j = 0;j<list.size();j++){
            arr[j] = list.get(j);
        }

        return arr;
    }
}