class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1){
            return 1;
        }

        
        int max = 0;
        int min = 0;

        for(int i =0; i<nums.length;i++){
            if(nums[i]<nums[min]){
                min = i;
            }

            if(nums[i]>nums[max]){
                max = i;
            }


        }

        int left = Math.min(max,min);
        int right = Math.max(max,min);

        



        return Math.min(
            right+1,

            Math.min(nums.length-left,
            (left+1) + (nums.length - right))

        );
        
    }
}