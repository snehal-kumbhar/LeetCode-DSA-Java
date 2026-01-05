/*
Leetcode Question Number = 1365
Name = How Many Numbers Are Smaller Than The Current Number
Given array nums of integers
Task is to return array containing how many numbers are smaller than
particular indexed number in nums.
*/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            ans[i]=count;
            count=0;
        }
        return ans;
    }
}