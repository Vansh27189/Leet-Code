class Solution {
    public int longestPalindrome(String s) {
        char[] words = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        

        for(char word: words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        int length = 0;
        boolean hasodd = false;

        for(int count:map.values()){
            if(count%2==0){
                length = length + count;
            }
            else{
                    length = length + count - 1;
                    hasodd= true;
            }

        }
        if(hasodd){
            length++;
        }
        return length;

        
    }
}