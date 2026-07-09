class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int bigt = k*threshold;
        int sum = 0;
        int count = 0;

        for(int i = 0;i<k;i++){
            sum = sum + arr[i];
        }

        if(sum>=bigt){
            count++;
        }

        for(int i = k; i<arr.length;i++){
            sum = sum + arr[i];
            sum = sum - arr[i-k];
            if(sum>=bigt){
                count++;
            }
        }
        return count;
    }
}