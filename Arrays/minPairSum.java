/* 
Leetcode Question Number = 1877
Name = Minimize Maximum Pair Sum in Array
Given an array nums of even length,
Task is to pair up all elements such that each element is used exactly once
and the maximum pair sum among all pairs is minimized.
Return the minimized maximum pair sum.
*/

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans=0;;
        for(int i=0;i<nums.length/2;i++){
            if(nums[i]+nums[n-1-i]>=ans){
            ans=nums[i]+nums[n-1-i];
            }
        }
        return ans;
    }
}