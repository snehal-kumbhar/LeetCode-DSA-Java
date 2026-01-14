/* 
Leetcode Question Number = 268
Name = Missing Number
Given an array nums containing n distinct numbers in range [o,n]
Task is to return the only number in the range that is missing from the array.
*/
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }

        return expectedSum - actualSum;
    }
}
