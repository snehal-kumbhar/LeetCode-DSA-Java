/*
Leetcode Question Number = 867
Name = Transpose Matrix
Given a 2D integer array matrix,
task is to return the transpose of matrix.
*/

class Solution {
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] ans =new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}