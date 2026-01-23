/* 
Leetcode Question Number = 3289
Name = The Two Sneaky Numbers of Digitville
Given an integer array nums containing numbers from 0 to n-1,
where each number should appear exactly once,
but two numbers appear twice.
Task is to find and return the two sneaky numbers in any order.
*/

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans=new int[2];
        int index=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans[index]=nums[i];
                index++;
            }
        }
        return ans;
    }
}