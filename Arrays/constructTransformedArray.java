/* 
Leetcode Question Number = 3379
Name = Transformed Array
Given an integer array nums representing a circular array,
For each index i, move nums[i] steps right if positive or left if negative,
Task is to set result[i] to the value at the final landed index,
If nums[i] is zero, result[i] remains nums[i].
*/

class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int k=nums[i];
            int x=i+k;
            int y=x%(nums.length);
            if(y<0){
                y=nums.length+y;
            }
            ans[i]=nums[y];
        }
        return ans;
    }
}