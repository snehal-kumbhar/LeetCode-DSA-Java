/* 
Leetcode Question Number = 485
Name = Max Consecutive Ones
Given a binary array nums consisting of only 0s and 1s.
Task is to find and return the maximum number of consecutive 1s
present in the array.
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
