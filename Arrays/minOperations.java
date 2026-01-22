/* 
Leetcode Question Number = 3512
Name = Minimum Operations to Make Array Sum Divisible by K
Given an integer array nums and an integer k,
Task is to return the minimum number of operations required to make the sum of the array divisible by k.
*/

class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int ans=sum%k;
        return ans;
    }
}