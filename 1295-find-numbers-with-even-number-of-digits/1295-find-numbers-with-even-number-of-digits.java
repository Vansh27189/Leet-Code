class Solution {
    public int findNumbers(int[] nums) {
        int eventcount = 0;
        for(int num : nums){
            int len = String.valueOf(num).length();
            if(len % 2==0){
                eventcount++;
            }
        }
    return eventcount;
    }
}