class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Sequence should increase by exactly 1
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // Step 2: Put all numbers into a HashSet
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        // Step 3: Find smallest missing number >= sum
        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
        
}