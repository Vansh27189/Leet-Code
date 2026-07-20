class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m =  grid.length, n = grid[0].length;
        int size = n*m;
        int index = 0;
        int temp[] = new int[size];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                temp[index++] = grid[i][j]; 
            }
            
        }
        //ind -> index -k time shift
        List<List<Integer>> ans = new ArrayList<>();
        index = 0;
        for(int i = 0;i<m;i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j<n;j++){
                int idx = ((index-k)%size + size)%size;
                int val = temp[idx];
                list.add(val);
                index++;
            }
            
        ans.add(list);   
        }
        return ans;
        
    }
}