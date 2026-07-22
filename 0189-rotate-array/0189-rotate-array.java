class Solution {
    public void rev(int[] nums, int start,int end){
        while(start<=end){

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        // 1 2 3 4 5 6 7
        // ---x--- --y--
        // 7 6 5 4 3 2 1
        //5 6 7 1 2 3 4
        int n = nums.length;
        if(k%n==0){
            return;
        }
        k = k%n;
        rev(nums,0,n-1);
        //       7 6 5 4 3 2 1
        //index -0 1 2 3 4 5 6
        //       5 6 7 
        //             1 2 3 4 
        //       5 6 7 1 2 3 4


        rev(nums,0,k-1);
        rev(nums,k,n-1);


        
    }
}