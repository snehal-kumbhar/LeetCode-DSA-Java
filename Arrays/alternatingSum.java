/* 
Leetcode Question Number = 3701
Name = Compute Alternating Sum
Given an integer array nums,
The alternating sum is obtained by adding elements at even indices
and subtracting elements at odd indices.
Task is to return the alternating sum of the array.
*/

class Solution {
    public int alternatingSum(int[] nums) {
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i=i+2){
            c1=c1+nums[i];
        }
        for(int i=1;i<nums.length;i=i+2){
            c2=c2+nums[i];
        }
        return c1-c2;

    }
}