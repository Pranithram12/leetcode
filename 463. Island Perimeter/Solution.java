class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows=grid.length;
        int cols = grid[0].length;
        int count = 0;
        
        for(int row=0;row<rows;row++){
           for(int col=0;col<cols;col++){
              if(grid[row][col] == 1){
                //up
                if(row>0 && grid[row-1][col]==0 || row==0){
                    count+=1;
                }
                //right
                 if(col<cols-1 && grid[row][col+1]==0 || col==cols-1){
                    count+=1;
                }
                //down
                 if(row<rows-1 && grid[row+1][col]==0 || row==rows-1){
                    count+=1;
                }
                //left
                 if(col>0 && grid[row][col-1]==0 || col==0){
                    count+=1;
                }
              }
           } 
        }
        return count;
    }
}