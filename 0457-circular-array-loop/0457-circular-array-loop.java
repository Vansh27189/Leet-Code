class Solution {
    public int calcNextIdx(int [] nums,int curr){
        int next = curr;
        int seq = nums[curr];

        if(seq>0){
            next = (next + seq) % nums.length;
        }else{
              int mod = seq % nums.length;
              int forward = nums.length + mod;
              next = (curr + forward)% nums.length;
        }
        return next;
    }

    public boolean circularArrayLoop(int[] nums) {
        //seq, k =1, all are +ve or all -ve
        // check for all indexes

        for(int i = 0;i<nums.length;i++){
            
            
            
            
            
            Set<Integer> set = new HashSet<>();
            set.add(i);

            boolean ispos = nums[i]>0;

            //cycle detection
            int curr = i;
            while(true){
                int next = calcNextIdx(nums,curr);

                if(ispos){
                    if(nums[next]<0){
                        break;
                    }
                    else{
                        if(set.contains(next)){
                            if(curr!=next){
                                return true;
                            }
                            else{
                                break;
                            }
                        }
                        set.add(next); 
                    }
                } 
                else{
                    if(nums[next]>0){
                        break;
                    }
                    else{
                        if(set.contains(next)){
                            if(curr!=next){
                                return true;
                            }
                            else{
                                break;
                            }
                        }
                    }
                    set.add(next);

                }
                curr = next;

            }

        }
        return false;
        
    }
}