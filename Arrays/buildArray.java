/* 
Leetcode Question Number = 1920
Name = Build Array from Permutation
Given a zero-based permutation array nums,
Task is to build and return an array ans of the same length where ans[i] = nums[nums[i]] for each valid index i.
*/

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i: nums){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}