/* 
Leetcode Question Number = 74
Name = Search a 2D Matrix
Given an m x n integer matrix where each row is sorted
and the first element of each row is greater than the last of the previous row,
Task is to return true if target exists in the matrix, else return false.
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int k=-1;
        for(int i=0;i<r-1;i++){
            if(target<matrix[i+1][0] && target>matrix[i][0]){
                k=i;
            }else if(matrix[i][0]==target){
                return true;
            }
        }
        if(k==-1) { //for last row
            if(target>=matrix[r-1][0]) {
                k=r-1;
            }else{
                return false;
            }
        }
        int s=0;
        int e=c-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(matrix[k][m]<target){
                s=m+1;
            }else if(matrix[k][m]>target){
                e=m-1;
            }else{
                return true;
            }
        }
        return false;
    }
}