/*
Leetcode Question Number = 1
Name = Two Sum
Given an integer array nums , and int target,
task is to return indices of two numbers
which add up to target
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }

            }
        }
      return ans;  
    }
}