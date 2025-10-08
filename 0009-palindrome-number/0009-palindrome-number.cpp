class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long long reversed = 0;
        long temp = x;
        while(temp!=0){
            int digits = temp % 10;
            reversed = reversed * 10 + digits;
            temp /=10;

        }
        return(reversed==x);
    }
};