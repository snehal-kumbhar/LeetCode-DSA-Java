/*
Leetcode Question Number = 1480
Name = Running Sum of 1d Array
Given an integer array nums,
the task is to return an array runningSum where:
runningSum[i] = sum of elements from nums[0] to nums[i]
In other words, each element in runningSum is the cumulative
sum of the array up to index i.
*/
class Solution {
    public int[] runningSum(int[] nums) {
        int x=nums.length;
        int[] ans=new int[x];
        ans[0]=nums[0];
        for(int i=1;i<x;i++){
            ans[i]=ans[i-1]+nums[i];
        }

        return ans;
    }
}