class Solution {
    public int findChampion(int[][] grid) {
        int no_of_one = 0;
        int winner   = 0;
        for(int i = 0;i<grid.length;i++){

            int count  = 0;
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j]== 1){
                    count++;
                }
            }
            if(count>no_of_one){
                no_of_one = count;
                winner  = i;
            }
        }
        return winner;
    }
}