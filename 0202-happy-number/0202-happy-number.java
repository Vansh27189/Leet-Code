class Solution {
    public int sqaureofnum(int n){
        int sum = 0;
        while(n!=0){
            int lastdigit = n%10;
            sum = sum + (lastdigit*lastdigit);
            n = n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n,
            fast = n;
    
        while(fast!=1){
            slow = sqaureofnum(slow);
            fast = sqaureofnum(sqaureofnum(fast));

            if(fast == 1){
                return true;
            }
            if(fast == slow){
                return false;
           }
        }
        return true;

    }
        
}