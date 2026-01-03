/*
Leetcode Question Number = 1351
Name = Count Negative Numbers in a Sorted Matrix
Given a mxn matrix named grid
Task is to count the number of negative numbers
*/

class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}