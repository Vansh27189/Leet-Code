    class Solution {
        public boolean isPalindrome(String s) {
            int i = 0;
            int j = s.length() - 1;

            while(i<j){
                

                while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                    i++;
                    

                }
                while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                    j--;
                    

                }
                char left = s.charAt(i);
                char right = s.charAt(j);

                if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
            
        }
    }
    // A man, a plan, a canal: Panama
    //       i
    //       l
    //                          j 
    //                          r 