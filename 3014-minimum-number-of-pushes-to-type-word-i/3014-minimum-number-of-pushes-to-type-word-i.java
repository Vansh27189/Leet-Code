class Solution {
    public int minimumPushes(String word) {

    // find frequency of all characters
    // sort them from high to low
     int[] freq = new int[26];

        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);

        int ans = 0;
        int index = 0;

        // Traverse from highest frequency to lowest
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) continue;

            int cost = (index / 8) + 1;
            ans += freq[i] * cost;
            index++;
        }

        return ans;
        
    }
}