/*
Leetcode Question Number = 1672
Name = Richest Customer Wealth

Given an m x n integer grid accounts
where accounts[i][j] represents the amount of money
the i-th customer has in the j-th bank.
A customer's wealth is the total money in all of their bank accounts.
The task is to return the maximum wealth among all customers, i.e.,
the highest total sum of money any customer has.
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int ans=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                ans=ans+accounts[i][j];
            }
            if(ans>max){
                max=ans;
            }
            ans=0;
        }
    return max;
    }
}