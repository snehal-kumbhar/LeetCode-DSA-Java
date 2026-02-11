/* 
Leetcode Question Number = 121
Name = Best Time to Buy and Sell Stock
Given an array prices where prices[i]=price of a given stock on ith day
Task is to return the maximum profit
*/
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            int today=prices[i]-min;
            if(today>profit){
                profit=today;
            }
        }
        return profit;
    }
}