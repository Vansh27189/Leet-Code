class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int k = 0;
        int temp;

        while(k<=j){
            if(nums[k]==1){
                k++;

            }
            else if(nums[k]==2){
                temp = nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                j--;

            }
            else{
                temp = nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                i++;
                k++;

            }
        }
    }
}