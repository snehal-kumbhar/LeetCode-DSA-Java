/*
Leetcode Question Number = 441
Name = Arranging Coins
Given n coins to build staircase
(of k rows where ith row has exactly i coins)
last row may be incomplete
task is to return number of complete rows of the staircase
*/
class Solution {
    public int arrangeCoins(int n) {
        long st = 0;   
        int c = 0;     
        for (int i = 1; st + i <= n; i++) {
            st = st + i;
            c++;
        }
        return c;
    }
}
