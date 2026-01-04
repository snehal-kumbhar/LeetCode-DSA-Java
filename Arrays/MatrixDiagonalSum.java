/*
Leetcode Question Number = 1572
Name = Matrix Diagonal Sum
Given a square matrix mat
Task is to return sum of matrix diagonals
*/
class Solution {
    public int diagonalSum(int[][] mat) {
        int m=mat.length;
        int d1=0;
        int d2=0;
        int sum=0;
        for(int i=0;i<m;i++){
            d1=d1+mat[i][i];
            d2=d2+mat[i][m-1-i];
        }
        if(m%2==0){
            sum=d1+d2;
        }
        else{
            int x=(m)/2;
            sum=d1+d2-mat[x][x];
        }
        return sum;
    }
}