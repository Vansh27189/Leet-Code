class Solution {
    int[][] t = new int[501][501];

    public int solve(int i,int j,int [] nums){
        if(i>j){
            return 0;
        }
        if(i==j){
            return nums[i];
        }

        if(t[i][j]!=-1){
            return t[i][j];
        }




        int take_i = nums[i] + Math.min(solve(i+2,j,nums),solve(i+1,j-1,nums));
        int take_j = nums[j] + Math.min(solve(i,j-2,nums),solve(i+1,j-1,nums));
        return t[i][j] = Math.max(take_i,take_j);




    }


    public boolean stoneGame(int[] piles) {
        int n = piles.length;

        int sum = 0;
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }


        for(int i = 0;i<n;i++){
            sum = sum + piles[i];
        }

        

        int alice_score = solve(0,n-1,piles);

        return alice_score > sum/2;
        
    }
}