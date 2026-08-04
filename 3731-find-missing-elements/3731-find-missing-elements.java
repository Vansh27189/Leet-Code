class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Set<Integer> set = new HashSet<>();

        for(int num:nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
            set.add(num);
        }

        List<Integer> ans = new ArrayList<>();

        for(int x = min+1;x<max;x++){
            if(!set.contains(x)){
                ans.add(x);
            }
        }
        return ans;

        
    }
}