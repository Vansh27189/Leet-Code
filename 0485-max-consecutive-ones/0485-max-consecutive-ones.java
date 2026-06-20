class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        int n = nums.length;
        int i = 0;
        while(i < n){
            if(nums[i]==1){
                count++;
                
            }
            else if(nums[i]==0){
                max = Math.max(count,max);
                count = 0;
            }
            i++;

        }
        return Math.max(count,max);
    }
}