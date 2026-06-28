class Solution {
    public int pivotIndex(int[] nums) {
        int rs= 0;
        int ls = 0;
        for(int i = 0;i<nums.length;i++){
            rs = rs + nums[i];
        }
        
        for(int i = 0;i<nums.length;i++){
            rs = rs-nums[i];
            if(ls==rs){
                return i;

            }
            ls = ls + nums[i];
            

        }
        return -1;

    }
}