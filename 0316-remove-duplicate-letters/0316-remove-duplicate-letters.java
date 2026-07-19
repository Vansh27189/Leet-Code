class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastindex = new int[26];
         
        for(int i = 0;i<s.length();i++){
            lastindex[s.charAt(i)-'a'] = i;
        }

        boolean[] visited = new boolean[26];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);

            if(visited[ch-'a']){
                continue;
            }

            while(sb.length()>0 && sb.charAt(sb.length()-1) > ch && lastindex[sb.charAt(sb.length()-1)-'a']>i){
                visited[sb.charAt(sb.length()-1) - 'a'] = false;
                sb.deleteCharAt(sb.length()-1);
            }

            sb.append(ch);

            visited[ch-'a'] = true;
        }
        return sb.toString();
        
    }
}