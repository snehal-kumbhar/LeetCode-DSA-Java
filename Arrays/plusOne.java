/*
Leetcode Question Number = 66
Name = Plus One
Given a large integer represented as an integer array digits
task is to increment large integer by one 
and return the resulting array of digits.
*/

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]=digits[i]+1;
                return digits;   
            }
            digits[i] = 0; 
        }

        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
}
