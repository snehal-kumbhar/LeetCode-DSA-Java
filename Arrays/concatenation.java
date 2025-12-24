/* 
Leetcode Question Number= 1929
Name= Concatenation of Array
Given an integer array nums of length n, 
the task is to create a new array ans of length 2n where:
ans[i] = nums[i] for 0 ≤ i < n
ans[i + n] = nums[i] for 0 ≤ i < n
*/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int x=nums.length;

        int[] ans=new int[2*x];
        for(int i=0;i<x;i++){
            ans[i]=nums[i];
            ans[x+i]=nums[i];
        }

        return ans;
        
    }
}